package com.king.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @date: 2020/3/1 22:14
 * @author: duanyong
 * @desc:
 */
@SpringBootApplication
@EnableEurekaClient
public class Server1Application {
    public static void main(String[] args) {
        SpringApplication.run(Server1Application.class,args);
    }
}
