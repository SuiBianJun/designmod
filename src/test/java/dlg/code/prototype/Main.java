package dlg.code.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // 浅拷贝
        PrototypeClass prototypeClass = new PrototypeClass();
        PrototypeClass prototypeClass1 = (PrototypeClass) prototypeClass.clone();
        System.out.println(prototypeClass.list == prototypeClass1.list);

        // 深拷贝
        PrototypeClassDeep prototypeClassDeep = new PrototypeClassDeep();
        PrototypeClassDeep prototypeClassDeep1 = (PrototypeClassDeep) prototypeClassDeep.clone();
        System.out.println(prototypeClassDeep.list == prototypeClassDeep1.list);


    }
}
