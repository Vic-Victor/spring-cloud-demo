package io.cloud.demo.dept2.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 14:50
 * @Description TODO
 */

@Configuration
public class MyselfRibbonRuleConfig {
    @Bean
    public IRule myRule() {
        return new MyRandomRule();
    }
}
