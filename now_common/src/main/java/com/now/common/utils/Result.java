package com.now.common.utils;

import lombok.Data;

/**
 * 返回结果
 * @param <T>
 */
@Data
public class Result<T> {

    private Integer code;

    private String msg;

    private T data;

    private Long timestamp;

    private Result() {
    }

    public Result (ResultEnums enums, T data) {
        this.code = enums.getCode();
        this.msg = enums.getMsg();
        this.data = data;
        this.timestamp = System.currentTimeMillis();
    }

}
