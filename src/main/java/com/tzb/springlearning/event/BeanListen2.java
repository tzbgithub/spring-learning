package com.tzb.springlearning.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Create by zhatang on 2021/8/26.
 */
public class BeanListen2 implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Class<?> c = event.getSource().getClass();
        if (c.getName().contains("SpringLearningApplication")) {
            System.out.println("BeanListen2接收到SpringLearningApplication事件！！");
        }
    }
}
