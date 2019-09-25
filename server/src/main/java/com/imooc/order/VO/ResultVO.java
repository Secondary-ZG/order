package com.imooc.order.VO;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-04 20:10
 * Description: 返回结果
 */
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
