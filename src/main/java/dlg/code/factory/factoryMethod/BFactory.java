package dlg.code.factory.factoryMethod;

public class BFactory implements IFactory{
    @Override
    public void get(){
        System.out.println("B Factory");
    }
}
