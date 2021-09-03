package com.tzb.springlearning.event;

import org.springframework.context.ApplicationEvent;

/**
 * Create by zhatang on 2021/8/26.
 */
public class CustomEvent extends ApplicationEvent {
    private String str;

    public CustomEvent(Object source, String str) {
        super(source);
        this.str = str;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
