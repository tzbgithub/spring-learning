package com.tzb.springlearning.propertyFile;

/**
 * Create by zhatang on 2021/8/25.
 */
public class BeanProperty {
    private String property1;
    private String property2;
    private String property3;
    private String property4;
    private String url;

    public BeanProperty() {
        System.out.println("执行构造方法");
    }
    public BeanProperty(String property1) {
        this.property1 = property1;
    }

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }

    public String getProperty3() {
        return property3;
    }

    public void setProperty3(String property3) {
        this.property3 = property3;
    }

    public String getProperty4() {
        return property4;
    }

    public void setProperty4(String property4) {
        this.property4 = property4;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
