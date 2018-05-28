package com.kinky;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * 
 * @author Loy Fu qq群 540553957  http://www.17jee.com
 * @since 1.8
 * @version 3.0.0
 * 
 */

@EnableZuulProxy
@SpringBootApplication
@EnableOAuth2Client

public class GatewayApplicationMain {
    static final Log logger = LogFactory.getLog(GatewayApplicationMain.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GatewayApplicationMain.class, args);
    }

}

