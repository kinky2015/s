package com.kinky;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.loy.e.core.repository.impl.DefaultRepositoryFactoryBean;

/**
 * 
 * @author Loy Fu qq群 540553957 http://www.17jee.com
 * @since 1.8
 * @version 3.0.0
 * 
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAutoConfiguration()
@ComponentScan(basePackages = { "com.loy" })
@EnableJpaRepositories(repositoryFactoryBeanClass = DefaultRepositoryFactoryBean.class)
@EnableCaching

public class LogApplicationMain implements CommandLineRunner {
    static final Log logger = LogFactory.getLog(LogApplicationMain.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(LogApplicationMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }

}

