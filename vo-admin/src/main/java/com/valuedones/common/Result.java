package com.valuedones.common;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    public static <T> Result<T> success(){
        Result<T> result = new Result<>();
        result.code = 1;
        return result;
    }

    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.data = data;
        result.code = 1;
        return result;
    }

    public static Result<String> error(String msg) {
        Result<String> result = new Result<>();
        result.msg = msg;
        result.code = 0;
        return result;
    }
}
