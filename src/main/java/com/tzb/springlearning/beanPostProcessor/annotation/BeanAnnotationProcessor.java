package com.tzb.springlearning.beanPostProcessor.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.annotation.Annotation;

/**
 * Create by zhatang on 2021/8/24.
 */
public class BeanAnnotationProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Annotation[] annotations = bean.getClass().getAnnotations();
        for (int i = 0; i < annotations.length; i++) {
            if (annotations[i].annotationType() == MyAnnotation.class) {
                System.out.println("发现我的注解");
                System.out.println("正在对我的注解进行处理");

            }
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
