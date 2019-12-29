package dlg.code.delegate;

/**
 * 委托模式
 * 关心结果，不关心过程。不关心要怎么做，而工厂模式需要确定如何生产对应的对象（工厂如何生成对象）
 * （经理和程序员）
 */

public class Delegate {

    private IExecutor excutor;

    public Delegate(IExecutor excutor){
        this.excutor = excutor;
    }

    public void work(){
        this.excutor.work();
    }

}
