package com.xin.chapter5_jdbc.common;


import java.io.Serializable;

public class Result implements Serializable {

    private Integer code;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(ResultCode resultCode, Object data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }

    private void setResultCode(ResultCode resultCode) {
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public void setData(Object data) {
        this.data = data;
    }

    //返回成功
    public static Result success() {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        return result;
    }

    //返回成功
    public static Result success(Object data) {
        Result result = new Result();
        result.setResultCode(ResultCode.SUCCESS);
        result.setData(data);
        return result;
    }

    //返回失败
    public static Result failure(ResultCode resultCode) {
        Result result = new Result();
        result.setResultCode(resultCode);
        return result;
    }

    //返回失败
    public static Result failure(ResultCode resultCode,Object data) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setData(data);
        return result;
    }

}
