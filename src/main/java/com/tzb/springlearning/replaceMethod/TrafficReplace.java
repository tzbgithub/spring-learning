package com.tzb.springlearning.replaceMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Create by zhatang on 2021/6/16.
 */
public class TrafficReplace  implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("乘坐"+args[0]+"去"+args[1]);
        return null;
    }
}
