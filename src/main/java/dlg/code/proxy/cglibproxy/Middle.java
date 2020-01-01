package dlg.code.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

/**
 * cglib 动态代理：
 *  通过子类继承的方式实现，子类调用方法是去调用父类的方法（被代理类的方法）
 *
 *  代理模式一般会在原来被代理人的执行逻辑前后增加一些操作。而委派模式不会增加操作
 */

public class Middle implements MethodInterceptor {

    static Logger logger = LoggerFactory.getLogger(Middle.class);

    // 生成字节码
    Object getInstance(Object target){
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(target.getClass());
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        logger.info("找房东");

        methodProxy.invokeSuper(o, null);

        logger.info("付房租");

        return null;
    }
}
