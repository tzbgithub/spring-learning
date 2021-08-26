package com.tzb.springlearning.propertyFile2;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

/**
 * Create by zhatang on 2021/8/25.
 */
public class DecryptPropertyConfigurer extends PropertyPlaceholderConfigurer {
    private String[] propertyNames = {"urllink"};

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        for (String t :
                propertyNames) {
            if (t.equalsIgnoreCase(propertyName)) {
                System.out.println("解密操作");
                return "decrypt url";
            }
        }
        return super.convertProperty(propertyName, propertyValue);
    }
}
