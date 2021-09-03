package com.tzb.springlearning.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create by zhatang on 2021/8/31.
 */
public class Viewer {
    public final static Logger logger = LoggerFactory.getLogger(Viewer.class);


    public void participate() {
        logger.info("观众入场");
    }
    public void cheer() {
        logger.info("观众欢呼");
    }
    public void leave() {
        logger.info("观众离场");
    }
}
