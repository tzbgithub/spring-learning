package com.tzb.springlearning.beanPostProcessor.filedsProcess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * Create by zhatang on 2021/8/23.
 */
public class BeanProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("beanProcessorDemo")) {
            return null;
        }
        System.out.println(bean.getClass() + "初始化之前调用");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (!beanName.equals("beanProcessorDemo")) {
            return null;
        }
        System.out.println(bean.getClass() + "初始化之后调用");
        Field[] fields = bean.getClass().getDeclaredFields();
        try {
            for (int i = 0; i <fields.length ; i++) {
                if (fields[i].getType().equals(String.class)) {
                    fields[i].setAccessible(true);
                    fields[i].set(bean,"After init str!");
                }

            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
