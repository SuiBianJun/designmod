package dlg.code.proxy.jdkproxy;

public class Main {

    public static void main(String[] args) {

        Person goodMan = (Person) new GoodMan().getInstance(new BadMan());
        goodMan.eat();

    }

}
