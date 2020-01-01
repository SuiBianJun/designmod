package dlg.code.prototype;

import java.util.Arrays;
import java.util.List;

/**
 * 复用已经实例化的对象
 * JDK实现：clone
 * 浅拷贝
 * 深拷贝
 */

public class PrototypeClassDeep implements Cloneable {

    int x = 0;
    List<Integer> list;

    public PrototypeClassDeep(){
        this.list = Arrays.asList(1, 2, 3);
    }

    // 浅拷贝，引用对象属性不会从新初始化
    @Override
    protected Object clone() throws CloneNotSupportedException {

        PrototypeClassDeep prototypeClass = new PrototypeClassDeep();

        return prototypeClass;
    }

}
