package com.sun.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.sun.entities.Dept;
import com.sun.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DeptController
{
	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix")
	public Dept get(@PathVariable("id") Long id)
	{
        Dept dept = service.get(id);

        if(dept == null){
	        throw new RuntimeException("改"+id+"没有对应信息");
        }
		return dept;
	}

	public Dept processHystrix(@PathVariable("id") Long id){
		return new Dept().setDeptNo(id).setDName("改"+id+"没有对应信息").setDbSource("no databases info");
	}

}
