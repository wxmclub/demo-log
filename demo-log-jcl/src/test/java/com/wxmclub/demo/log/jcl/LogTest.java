package com.wxmclub.demo.log.jcl;

import com.wxmclub.demo.log.core.JCLBase;
import com.wxmclub.demo.log.core.Log4j2Base;
import com.wxmclub.demo.log.core.Log4jBase;
import com.wxmclub.demo.log.core.Slf4jBase;
import org.junit.Test;

/**
 * commons-logging日志配置顺序
 *
 * 1) 首先在classpath下寻找自己的配置文件commons-logging.properties，如果找到，则使用其中定义的Log实现类；<br>
 * 2) 如果找不到commons-logging.properties文件，则在查找是否已定义系统环境变量org.apache.commons.logging.Log，找到则使用其定义的Log实现类；<br>
 * 如果在Tomact中可以建立一个叫 ：CATALINA_OPTS 的环境变量 <br>
 * 给他的值 ： - Dorg.apache.commons.logging.Log = org.apache.commons.logging.impl.SimpleLog - Dorg.apache.commons.logging.simplelog.defaultlog = warn<br>
 * 3) 否则，查看classpath中是否有Log4j的包，如果发现，则自动使用Log4j作为日志实现类；<br>
 * 4) 否则，使用JDK自身的日志实现类（JDK1.4以后才有日志实现类）；<br>
 * 5) 否则，使用commons-logging自己提供的一个简单的日志实现类SimpleLog；<br>
 *
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

    public void testLog4j() {
        // 不能使用
        Log4jBase.printLog();
    }

    @Test
    public void testLog4j2() {
        Log4j2Base.printLog();
    }

}
