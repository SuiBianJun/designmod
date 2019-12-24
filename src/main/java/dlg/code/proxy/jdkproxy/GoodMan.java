package dlg.code.proxy.jdkproxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

/**
 * jdk 动态代理：
 * 以接口来实现
 * 生成新的类，继承公共的接口，再生成字节码文件加载到内存中，再调用对应的方法
 * 子类的引用指向父类
 */

public class GoodMan implements InvocationHandler {

    static Logger logger = LoggerFactory.getLogger(GoodMan.class);

    Object target;

    Object getInstance(Object target){

        this.target = target;

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        logger.info("好人带饭");

        method.invoke(this.target, args);

        TimeUnit.SECONDS.sleep(1);

        logger.info("好人把垃圾带走");

        return null;
    }
}
