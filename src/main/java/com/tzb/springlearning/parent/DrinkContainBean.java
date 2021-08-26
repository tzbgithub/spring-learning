package com.tzb.springlearning.parent;

/**
 * Create by zhatang on 2021/6/16.
 */
public class DrinkContainBean {
    private String name;

    public void drink(String thing) {
        System.out.println("正在用容器"+name+"喝"+thing);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
