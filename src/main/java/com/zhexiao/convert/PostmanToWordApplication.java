package com.zhexiao.convert;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * PostmanToWordApplication
 * 
 * @author CharlemanChen
 *
 */
@SpringBootApplication
public class PostmanToWordApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostmanToWordApplication.class, args);
    }
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的Application启动类
        return builder.sources(PostmanToWordApplication.class);
    }
}
