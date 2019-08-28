package com.now.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.now.oauth2.server.mapper")
public class NowOauth2ServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NowOauth2ServerApplication.class, args);
    }

}
