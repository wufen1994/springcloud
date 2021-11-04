package com.it.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description: RestTemplate的配置类
 * @author: wf
 * @create: 2021-11-04 18:48
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate getRestTemplate(){
        RestTemplate template = new RestTemplate();
        return template;
    }
}
