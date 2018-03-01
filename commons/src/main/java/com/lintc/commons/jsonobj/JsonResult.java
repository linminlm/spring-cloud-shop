package com.lintc.commons.jsonobj;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/28
 * @公司：汽车易生活
 */
public class JsonResult<T> {
    private String code;
    private String message;
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
