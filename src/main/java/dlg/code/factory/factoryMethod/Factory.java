package dlg.code.factory.factoryMethod;

/**
 * 工厂方法
 * 对象生成的公共方法集成到接口中，再进行不同的实现，并根据需求返回对象
 */

public class Factory {
    public void get(String type){
        switch (type){
            case "A": {
                new AFactory().get();
            }break;
            case "B": {
                new BFactory().get();
            }break;
        }
    }

}
