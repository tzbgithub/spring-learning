package com.tzb.springlearning.beanReplace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by zhatang on 2021/6/17.
 */
public abstract class Lookup {
     public void action(){
         getMethod().perform();
         System.out.println("执行的是替换方法");
     }
     //对比用
     public void actionContext(){
         ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanReplace.xml");
         LookupInterface lookupInterface = (LookupInterface)context.getBean("lookupInterfaceImpl");
         lookupInterface.perform();
     }

     public abstract LookupInterface getMethod();


}
