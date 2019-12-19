package com.oyft.springcloud.controller;



import com.oyft.springcloud.entities.Dept;
import com.oyft.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//添加注解
@RestController
public class DeptController {
    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return service.add(dept);
    }

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return service.list();
    }

    /*
    * 服务发现
    * */
    @RequestMapping(value = "/dept/discovery",method = RequestMethod.GET)
    public List<ServiceInstance> discovery(){
        List<String> list = client.getServices();
        System.out.println("**********" + list);
        List<ServiceInstance> serviceInstances = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance ele : serviceInstances){
            System.out.println(ele.getServiceId()+"\t"+ele.getHost()+"\t"+ele.getPort()+"\t"+ele.getUri());
        }
        return serviceInstances;
    }
}
