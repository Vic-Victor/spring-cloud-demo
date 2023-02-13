package io.cloud.demo.dept2;

import io.cloud.demo.dept2.config.myrule.MyselfRibbonRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 14:25
 * @Description TODO
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICECLOUDPROVIDERDEPT", configuration = MyselfRibbonRuleConfig.class)
public class MicroServiceCloudConsumerDept80Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConsumerDept80Application.class, args);
    }
}
