package org.huihui.reflectdemo;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }


    @Test
    public void reflectMethodRetern() throws Exception {
        Type genericReturnType = ReflecgtMethod.class.getMethod("get").getGenericReturnType();
        Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
        System.out.println("......");

    }

    public class ReflecgtMethod {
        public List<String> get() {
            return new ArrayList<>();
        }
    }

    @Test
    public void ReflectClassGeneric() {
        ParameterizedType genericSuperclass = (ParameterizedType) Child.class.getGenericSuperclass();
        Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
    }

    public class Child extends Parent<String> {

    }

    public class Parent<T> {

    }
}