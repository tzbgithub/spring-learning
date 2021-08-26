package com.tzb.springlearning.propertyBean;

/**
 * Create by zhatang on 2021/6/25.
 */
public class BeanPhoneNum {
    private String areaCode;
    private String number;
    public BeanPhoneNum(String areaCode,String number){
        this.areaCode = areaCode;
        this.number = number;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "BeanPhoneNum{" +
                "areaCode='" + areaCode + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

