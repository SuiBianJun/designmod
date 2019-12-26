package dlg.code.factory.simpleFactory;

/**
 * 简单工厂
 * 直接根据需求返回对应的对象
 */

public class GFactory {
    public void get(String type) {
        switch (type){
            case "A": {
                System.out.println("A");
            }break;
            case "B": {
                System.out.println("B");
            }break;
        }
    }
}
