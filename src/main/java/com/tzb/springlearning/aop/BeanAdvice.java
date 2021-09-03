package com.tzb.springlearning.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Method;

/**
 * Create by zhatang on 2021/9/1.
 */
public class BeanAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {
    private final static Logger logger = LoggerFactory.getLogger(BeanAdvice.class);

    private Viewer viewer;

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        //调用核心业务之后
        viewer.cheer();
        viewer.leave();
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        viewer.participate();
    }

    public void afterThrowing(Throwable throwable) {
        logger.error("演出出现了问题");
    }
}
