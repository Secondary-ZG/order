package com.imooc.order.enums;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 20:31
 * Description: 订单状态
 */
public enum  OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
    ;

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
