package com.wxmclub.demo.log.log4j2;

import com.wxmclub.demo.log.core.JCLBase;
import com.wxmclub.demo.log.core.Log4j2Base;
import com.wxmclub.demo.log.core.Log4jBase;
import com.wxmclub.demo.log.core.Slf4jBase;
import org.junit.Test;

/**
 * @author wxmclub@gmail.com
 * @version 1.0
 * @date 2017-05-10
 */
public class LogTest {

    @Test
    public void testSlf4j() {
        Slf4jBase.printLog();
    }

    @Test
    public void testJCL() {
        JCLBase.printLog();
    }

    @Test
    public void testLog4j() {
        Log4jBase.printLog();
    }

    @Test
    public void testLog4j2() {
        Log4j2Base.printLog();
    }

}
