package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 20:23
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
