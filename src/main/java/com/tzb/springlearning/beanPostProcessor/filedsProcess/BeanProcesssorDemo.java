package com.tzb.springlearning.beanPostProcessor.filedsProcess;

/**
 * Create by zhatang on 2021/8/23.
 */
public class BeanProcesssorDemo {
    private String str;

    //构造方法
    public BeanProcesssorDemo(String str) {
        this.str = str;
        System.out.println(BeanProcesssorDemo.class + "类执行构造方法注入");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
        System.out.println(BeanProcesssorDemo.class+"类执行Set注入！！");
    }

    public void init() {
        this.str = "hello world";
        System.out.println(BeanProcesssorDemo.class+"执行初始化方法！！！");
    }
}
