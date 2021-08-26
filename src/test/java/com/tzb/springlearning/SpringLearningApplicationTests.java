package com.tzb.springlearning;

import com.tzb.springlearning.beanFactoryPostProcessor.BeanFactoryDemo;
import com.tzb.springlearning.beanPostProcessor.annotation.BeanAnnotation;
import com.tzb.springlearning.beanPostProcessor.filedsProcess.BeanProcesssorDemo;
import com.tzb.springlearning.beanReplace.Lookup;
import com.tzb.springlearning.notSpringBean.BeanConfigurable;
import com.tzb.springlearning.parent.DrinkBean;
import com.tzb.springlearning.propertyBean.BeanContact;
import com.tzb.springlearning.propertyBean.BeanPhoneNum;
import com.tzb.springlearning.propertyBean.PhoneEditor;
import com.tzb.springlearning.propertyFile.BeanProperty;
import com.tzb.springlearning.replaceMethod.Traffic;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class SpringLearningApplicationTests {

    @Test
    void contextLoads() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInit.xml");
    }

    @Test
    void testDrinkBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInit.xml");
        DrinkBean bean =(DrinkBean) context.getBean("drinkbean1");
        bean.drink();
    }

    @Test
    void testDrinkBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationInit.xml");
        DrinkBean bean2 =(DrinkBean) context.getBean("drinkbean2");
        DrinkBean bean3 =(DrinkBean) context.getBean("drinkbean3");
        System.out.println(bean2 == bean3);
    }


    @Test
    void testTrafficBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationReplaceMethod.xml");
        Traffic trafficBean = (Traffic)context.getBean("trafficBean");
        trafficBean.goByBike("飞机","中国");
    }


    @Test
    void  testLookup(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanReplace.xml");
        Lookup bean = (Lookup)context.getBean("lookup");
        bean.action();
        bean.actionContext();
    }

    @Test
    void  testNotSpringBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationNotSpringBean.xml");
        BeanConfigurable beanConfigurable = new BeanConfigurable();
        System.out.println(beanConfigurable.getInfo());
    }
    @Test
    void  testPropertyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationPropertyBean.xml");
        BeanContact beanContact = (BeanContact) context.getBean("beanContact");
        System.out.println(beanContact.getPhoneNum());
    }
    @Test
    void  testPropertyBean2(){
        PhoneEditor phoneEditor = new PhoneEditor();
        phoneEditor.setAsText("1234-1234567");
        System.out.println(phoneEditor.getAsText()) ;
        BeanPhoneNum phoneNum = (BeanPhoneNum) phoneEditor.getValue();
        System.out.println(phoneNum.getAreaCode());
        System.out.println(phoneNum.getNumber());
    }
    @Test
    void  testBeanProcessor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanProcessor.xml");
        BeanProcesssorDemo beanProcesssorDemo = (BeanProcesssorDemo) context.getBean("beanProcessorDemo");
        System.out.println(beanProcesssorDemo.getStr());
    }
    @Test
    void  testBeanAnnotationProcessor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanAnnotationProcessor.xml");
        BeanAnnotation beanAnnotation = (BeanAnnotation) context.getBean("beanAnnotation");
        System.out.println(beanAnnotation.getStr());
    }
    @Test
    void  testBeanFactoryPostProcessor(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanFactoryPostProcessor.xml");
    }
    @Test
    void  testBeanFactoryPostProcessor2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanFactoryPostProcessor.xml");
        BeanFactoryDemo bean =(BeanFactoryDemo) context.getBean("beanFactoryDemo");
        System.out.println(bean.getStr());
    }

    @Test
    void  testBeanProperty(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanProperty.xml");
         BeanProperty bean =(BeanProperty) context.getBean("bean_override");
        System.out.println(bean.getProperty1());
        System.out.println(bean.getProperty2());
    }

    @Test
    void  testBeanPlaceHolder(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanProperty.xml");
        BeanProperty bean =(BeanProperty) context.getBean("bean_placeholder");
        System.out.println(bean.getProperty3());
        System.out.println(bean.getProperty4());
    }

    @Test
    void  testBeanUrl(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanProperty2.xml");
        BeanProperty bean =(BeanProperty) context.getBean("bean_placeholder_url");
        System.out.println(bean.getUrl());

    }

}
