package dlg.code.delegate;

/**
 * 委托模式
 * 关心结果，不关心过程。不关心要怎么做，而代理模式需要增加额外的操作
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
