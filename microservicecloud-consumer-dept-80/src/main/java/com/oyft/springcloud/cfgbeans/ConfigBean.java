package com.oyft.springcloud.cfgbeans;


import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


//注解配置类
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //Ribbon做负载均衡 
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    //Ribbon负载均衡算法
    //共有七种
    @Bean
    public IRule myRule(){
        //默认轮询
//        return new RoundRobinRule(); // 轮询
//        return new RandomRule(); //随机
//        return new RetryRule(); //重试
//        return new BestAvailableRule(); //过滤 过滤掉多次访问故障而处于断路器跳闸状态的服务并选择并发量小的
//        return new ZoneAvoidanceRule(); //复合判断 判断server所在区域的性能和server的可用性进行选择
        /*
        * 权重 根据平时计算的所有服务的权重，响应快权重大 统计数据不足时则使用轮询
        * */
//        return new WeightedResponseTimeRule();
        /*
        * 会过滤掉由于多次访问故障而处于断路器跳闸状态的服务和超过并发数阈值的服务，对剩余列表进行轮询
        * */
        return new AvailabilityFilteringRule();
    }
}
