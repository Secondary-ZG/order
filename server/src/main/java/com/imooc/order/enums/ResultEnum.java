package com.imooc.order.enums;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-02 22:04
 * Description: 返回结果异常枚举
 */
public enum  ResultEnum {

    PARAM_ERROR(1, "参数错误"),
    CART_EMPTY(2, "购物车为空")
    ;

    private Integer code;

    private String message;

    public Integer getCode() {
        return code;
    }

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
