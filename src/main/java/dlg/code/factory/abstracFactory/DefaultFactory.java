package dlg.code.factory.abstracFactory;

import dlg.code.factory.factoryMethod.AFactory;
import dlg.code.factory.factoryMethod.BFactory;

/**
 *  抽象工厂
 *  对象公共方法集成到抽象类中，提供默认方法和根据需求返回对象的方法
 */

public class DefaultFactory extends DFactory {
    @Override
    public void get() {
        new AFactory().get();
    }
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
