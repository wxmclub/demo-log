package com.wxmclub.demo.log.core;

import org.apache.log4j.Logger;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2017-05-10
 */
public class Log4jBase {

    protected static Logger log = Logger.getLogger(Log4jBase.class);

    public static void printLog() {
        log.debug("this is debug log!");
        log.info("this is info log!");
        log.warn("this is warn log!");
        log.error("this is error log!");
    }

}
