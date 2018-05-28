package com.kinky;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 
 * @author Loy Fu qq群 540553957  http://www.17jee.com
 * @since 1.8
 * @version 3.0.0
 * 
 */
@SpringBootApplication
public class UIApplicationMain {
    static final Log logger = LogFactory.getLog(UIApplicationMain.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(UIApplicationMain.class, args);
    }
}

