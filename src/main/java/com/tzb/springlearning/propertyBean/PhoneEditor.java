package com.tzb.springlearning.propertyBean;

import java.beans.PropertyEditorSupport;

/**
 * Create by zhatang on 2021/6/25.
 */
public class PhoneEditor extends PropertyEditorSupport {

    //接受外部传进来的字符串
    @Override
    public String getAsText() {
        return super.getAsText();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String areaCode = text.substring(0, 4);
        String number = text.substring(5, 12);
        BeanPhoneNum beanPhoneNum = new BeanPhoneNum(areaCode, number);
        setValue(beanPhoneNum);
    }
}
