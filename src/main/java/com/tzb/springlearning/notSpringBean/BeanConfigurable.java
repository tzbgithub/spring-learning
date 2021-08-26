package com.tzb.springlearning.notSpringBean;

import org.springframework.beans.factory.annotation.Configurable;

/**
 * Create by zhatang on 2021/6/24.
 */
@Configurable("beanConfigurable") //添加这个注解代表当前的bean能够被spring配置
public class BeanConfigurable {
    public String info;

    public BeanRef beanRef;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public BeanRef getBeanRef() {
        return beanRef;
    }

    public void setBeanRef(BeanRef beanRef) {
        this.beanRef = beanRef;
    }
}

class BeanRef {

}
