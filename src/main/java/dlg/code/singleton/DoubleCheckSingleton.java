package dlg.code.singleton;

public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton instance;//volatile 防止[1] 处初始化后其他线程无法感知，导致多次初始化

    private DoubleCheckSingleton(){}

    public DoubleCheckSingleton getInstance(){
        if(null == instance){// 多线程时减少锁的获取次数
            synchronized (DoubleCheckSingleton.class){// 防止多线程初始化多次
                if(null == instance){
                    instance = new DoubleCheckSingleton();// [1]
                    return instance;
                }
            }
        }
        return instance;
    }
}
