package com.imooc.order.controller;

import com.imooc.order.client.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-04 21:01
 */
@RestController
@Slf4j
public class ClientController {

    //@Autowired
    //private LoadBalancerClient loadBalancerClient;

    //@Autowired
    //private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductMsg")
    public String getProductMsg() {
        //1.第一种方式(直接受用restTemplate， url写死)
        //RestTemplate restTemplate = new RestTemplate();
        //String response = restTemplate.getForObject("http://localhost:8762/msg", String.class);chr

        //2.第二种方式(利用loadBalancerClient通过应用获取url，然后再使用restTemplate)
        //RestTemplate restTemplate = new RestTemplate();
        //ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        //serviceInstance.getHost();
        //String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/msg");
        //String response = restTemplate.getForObject(url, String.class);

        //3. 第三种方式(利用注解@LoadBalanced，可在restTemplate中使用应用的名字)
        //String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);

        String response = productClient.productMsg();
        log.info("response={}", response);
        return response;
    }

}