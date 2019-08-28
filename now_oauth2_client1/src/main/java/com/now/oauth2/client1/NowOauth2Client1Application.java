package com.now.oauth2.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
public class NowOauth2Client1Application {

    public static void main(String[] args) {
        SpringApplication.run(NowOauth2Client1Application.class, args);
    }

}
