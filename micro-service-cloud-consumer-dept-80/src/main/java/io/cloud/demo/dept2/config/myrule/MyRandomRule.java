package io.cloud.demo.dept2.config.myrule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import java.util.List;

/**
 * @Author Cloud_J
 * @Create 2023/2/13 14:52
 * @Description 自定义 ribbon 负载均衡则略
 */
public class MyRandomRule extends AbstractLoadBalancerRule {

    /**
     * 总共被调用的次数
     */
    private int total = 0;
    /**
     * 当前提供服务的机器号
     */
    private int currentIndex = 0;


    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {

    }

    @Override
    public Server choose(Object key) {
        return choose(getLoadBalancer(), key);
    }

    public Server choose(ILoadBalancer lb, Object key) {
        if (null == lb) {
            return null;
        }
        Server server = null;

        while (null == server) {
            if (Thread.interrupted()) {
                return null;
            }
            // 获取所有有效的服务实力列表
            List<Server> upList = lb.getReachableServers();
            // 获取所有的服务实例的列表
            List<Server> allList = lb.getAllServers();

            // 如果没有任何的服务实例则返回 null
            int serverCount = allList.size();
            if (0 == serverCount) {
                return null;
            }

            // 与随机策略相似, 但每个服务实例只有在调用3次之后, 才会调用其他的服务实例
            if (total < 3) {
                server = upList.get(currentIndex);
                total ++;
            } else {
                total = 0;
                currentIndex ++;
                if (currentIndex >= upList.size()) {
                    currentIndex = 0;
                }
            }
            if (null == server) {
                Thread.yield();
                continue;
            }

            if (server.isAlive()) {
                return server;
            }

            server = null;
            Thread.yield();
        }
        return server;
    }
}
