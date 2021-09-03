package com.tzb.springlearning.beanAware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Create by zhatang on 2021/8/27.
 */
public class BeanAppAwareImpl implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public <T> T getBean(String name) {
        T obj = (T)applicationContext.getBean(name);
        return obj;
    }
}
