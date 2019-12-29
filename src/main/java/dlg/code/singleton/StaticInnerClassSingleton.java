package dlg.code.singleton;

public class StaticInnerClassSingleton {
    private static class InstanceHolder{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    private StaticInnerClassSingleton(){}

    public static StaticInnerClassSingleton getInstance(){
        return InstanceHolder.INSTANCE;
    }

}
