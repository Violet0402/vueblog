package com.sumaojin.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * 返回的json结果数据封装类
 */
@Data
public class Result implements Serializable {
    private int code;//状态码，200表示成功，非200表示异常
    private String msg;
    private Object data;

    public static Result common(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result succ(Object data){
        return common(200, "操作成功", data);
    }

    public static Result succ(String msg, Object data){
        return common(200, msg, data);
    }

    public static Result fail(int code, String msg, Object data){
        return common(code, msg, data);
    }

    public static Result fail(String msg, Object data){
        return common(400, msg, data);
    }

    public static Result fail(String msg){
        return common(400, msg, null);
    }

}
