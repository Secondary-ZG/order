package com.imooc.order.exception;

import com.imooc.order.enums.ResultEnum;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-02 22:02
 * Description:
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
