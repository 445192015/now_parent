package com.now.common.utils;

import lombok.Getter;

/**
 * 返回状态码
 */
@Getter
public enum  ResultEnums {
    SUCCESS(0, "OK"),
    UNKNOWN_ERROR(-1, "系统异常，请联系管理员"),
    UNAUTHORIZED(401, "认证失败"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "请求的资源不存在"),
    SERVER_ERROR(500, "服务器内部错误"),
    ;

    private Integer code;

    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
