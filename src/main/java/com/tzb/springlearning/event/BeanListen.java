package com.tzb.springlearning.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Create by zhatang on 2021/8/26.
 */
public class BeanListen implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        Class<?> c = event.getSource().getClass();
        if (c.getName().contains("ClassPathXmlApplicationContext")) {
            System.out.println("BeanListen接收到ClassPathXmlApplicationContext事件！！");
        }
    }
}
