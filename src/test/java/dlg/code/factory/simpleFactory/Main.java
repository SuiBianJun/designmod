package dlg.code.factory.simpleFactory;

import dlg.code.factory.factoryMethod.AFactory;

public class Main {

    public static void main(String[] args) {

        new GFactory().get("A");
        new GFactory().get("B");

    }

}
