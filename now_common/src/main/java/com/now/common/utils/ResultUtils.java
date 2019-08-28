package com.now.common.utils;

/**
 * 返回工具类
 */
public class ResultUtils {

    public static Result success() {
        return success(null);
    }

    public static Result success(Object obj) {
        return new Result(ResultEnums.SUCCESS, obj);
    }

    public static Result error(ResultEnums enums) {
        return error(enums, null);
    }

    public static Result error(ResultEnums enums, Object obj) {
        return new Result(enums, obj);
    }

}
