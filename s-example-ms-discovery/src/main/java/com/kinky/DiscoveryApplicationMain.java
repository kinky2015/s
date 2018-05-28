package com.kinky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Loy Fu qq群 540553957  http://www.17jee.com
 * @since 1.8
 * @version 3.0.0
 * 
 */

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryApplicationMain.class, args);
    }
}
