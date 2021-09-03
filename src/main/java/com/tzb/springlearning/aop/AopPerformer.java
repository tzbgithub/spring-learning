package com.tzb.springlearning.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create by zhatang on 2021/8/31.
 */
public class AopPerformer {

    private static final Logger logger = LoggerFactory.getLogger(AopPerformer.class);
    public void perform() {
        logger.info("表演者正在表演");
    }
}
