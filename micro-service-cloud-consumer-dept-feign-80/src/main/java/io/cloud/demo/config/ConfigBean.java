package io.cloud.demo.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 16:07
 * @Description TODO
 */
@Configuration
public class ConfigBean {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
