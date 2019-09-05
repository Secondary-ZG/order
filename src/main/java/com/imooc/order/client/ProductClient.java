package com.imooc.order.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Java Interface
 *
 * @author Secondary
 * @date 2019-09-04 21:59
 */
@FeignClient(name = "product")
public interface ProductClient {

    /**
     * product服务下的msg接口
     * @return
     */
    @GetMapping("/msg")
    String productMsg();

}

