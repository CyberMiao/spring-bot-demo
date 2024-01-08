package com.miaow;

import love.forte.simboot.spring.autoconfigure.EnableSimbot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring入口类
 *
 * @author TenStreets
 * @version 1.0
 */
@SpringBootApplication
@EnableSimbot
public class SpringBotAPP {

    public static void main(String[] args) {
        SpringApplication.run(SpringBotAPP.class, args);
    }

}
