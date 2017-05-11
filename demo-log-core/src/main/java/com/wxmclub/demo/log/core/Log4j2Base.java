package com.wxmclub.demo.log.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2017-05-10
 */
public class Log4j2Base {

    protected static Logger log = LogManager.getLogger(Log4j2Base.class);

    public static void printLog() {
        log.debug("this is debug log!");
        log.info("this is info log!");
        log.warn("this is warn log!");
        log.error("this is error log!");
    }

}
