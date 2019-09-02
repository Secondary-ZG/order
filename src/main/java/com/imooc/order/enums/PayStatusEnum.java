package com.imooc.order.enums;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 20:55
 * Description: 支付状态
 */
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;
    private String message;

    PayStatusEnum(Integer code, String message) {
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
