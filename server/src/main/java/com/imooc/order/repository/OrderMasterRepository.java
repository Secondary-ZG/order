package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 20:21
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
