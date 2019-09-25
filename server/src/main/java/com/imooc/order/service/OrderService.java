package com.imooc.order.service;

import com.imooc.order.dto.OrderDTO;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 21:20
 */
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

}
