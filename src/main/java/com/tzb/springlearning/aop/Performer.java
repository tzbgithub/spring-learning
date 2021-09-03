package com.tzb.springlearning.aop;

import jdk.nashorn.internal.ir.debug.PrintVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Create by zhatang on 2021/8/31.
 */
public class Performer {

    public Viewer viewer;

    private Logger logger = LoggerFactory.getLogger(Performer.class);
    public void perform() {
        viewer.participate();
        logger.info("表演者正在表演");
        viewer.cheer();
        viewer.leave();
    }

    public Viewer getViewer() {
        return viewer;
    }

    public void setViewer(Viewer viewer) {
        this.viewer = viewer;
    }
}
