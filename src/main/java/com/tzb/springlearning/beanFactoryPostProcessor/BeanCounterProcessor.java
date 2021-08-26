package com.tzb.springlearning.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Create by zhatang on 2021/8/24.
 */
public class BeanCounterProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        for (String beanName:
             beanNames) {
            System.out.println(beanName);
        }
        System.out.println("发现" + beanFactory.getBeanDefinitionCount() + "个beans");
    }
}
