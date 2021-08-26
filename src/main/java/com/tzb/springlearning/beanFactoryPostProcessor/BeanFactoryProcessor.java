package com.tzb.springlearning.beanFactoryPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Create by zhatang on 2021/8/25.
 */
public class BeanFactoryProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("开始调用beanfactorypostprocessor");
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name:
             names) {
            if ("beanFactoryDemo".equals(name)) {
                //利用工厂处理器来修改这个Bean的属性值
                BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
                System.out.println("利用工厂后处理器来修改str值");
                beanDefinition.getPropertyValues().add("str", "hello world 2");
            }
        }

        System.out.println("结束调用beanfactorypostprocessor");
    }
}
