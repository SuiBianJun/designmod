package dlg.code.factory.abstractFactory;

import dlg.code.factory.abstracFactory.DefaultFactory;
import dlg.code.factory.factoryMethod.Factory;

public class Main {

    public static void main(String[] args) {

        new DefaultFactory().get();
        new DefaultFactory().get("B");
    }

}
