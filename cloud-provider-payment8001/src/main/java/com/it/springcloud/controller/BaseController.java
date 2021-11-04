package com.it.springcloud.controller;

import com.it.springcloud.entity.CommonResult;

/**
 * @program: springcloud
 * @description: 基本类
 * @author: wf
 * @create: 2021-11-04 14:13
 */
public class BaseController {

    protected <T> CommonResult<T> successRespoonse(String message, T data){
        return createResponse(200, message,data);
    }

    protected <T> CommonResult<T> errorRespoonse(int i, String message){
        return createResponse(100, message,null);
    }

    public <T> CommonResult<T> createResponse(Integer status,String message, T data){
        CommonResult<T> result = new CommonResult();
        if (data != null){
            result.setData(data);
        }else {
            result.setData(null);
        }
        result.setCode(status);
        result.setMessage(message);
        return result;
    }
}
