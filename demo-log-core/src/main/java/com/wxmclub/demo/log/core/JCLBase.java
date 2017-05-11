package com.wxmclub.demo.log.core;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2017-05-10
 */
public class JCLBase {

    protected static Log log = LogFactory.getLog(JCLBase.class);

    public static void printLog() {
        log.debug("this is debug log!");
        log.info("this is info log!");
        log.warn("this is warn log!");
        log.error("this is error log!");
    }

}
