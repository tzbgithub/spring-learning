package com.tzb.springlearning.beanAware;

import org.springframework.beans.factory.BeanNameAware;

/**
 * Create by zhatang on 2021/8/27.
 */
public class BeanNameAwareImpl implements BeanNameAware {
    private String name;

    @Override
    public void setBeanName(String name) {
        System.out.println("Bean名称为：" + name);
    }

    public void rename(String name) {
        this.name = name;
        setBeanName(name);
    }

    public String getBeanName() {
        return name;
    }
}
