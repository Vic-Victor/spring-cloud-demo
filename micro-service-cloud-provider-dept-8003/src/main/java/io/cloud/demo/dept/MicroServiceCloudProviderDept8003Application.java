package io.cloud.demo.dept;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Spring cloud Eureka 客户端，自动将本服务注册到 Eureka Server 注册中心中
 *
 * @Author Cloud_J
 * @Create 2023/2/10 17:02
 * @Description TODO
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
public class MicroServiceCloudProviderDept8003Application {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudProviderDept8003Application.class, args);
        log.info("MicroServiceCloudProviderDept8003Application -- 8003 boot successfully...");
    }
}
