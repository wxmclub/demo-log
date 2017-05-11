package com.wxmclub.demo.log.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2017-05-10
 */
public class Slf4jBase {

    protected static Logger log = LoggerFactory.getLogger(Slf4jBase.class);

    public static void printLog() {
        log.debug("this is debug log!");
        log.info("this is info log!");
        log.warn("this is warn log!");
        log.error("this is error log!");
    }

}
