package com.lintc.commons.utils;

import com.lintc.commons.jsonobj.JsonResult;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/28
 * @公司：汽车易生活
 */
public class ResultUtils {

    public static JsonResult success(Object obj){
        JsonResult<Object> objectJsonResult = new JsonResult<>();
        objectJsonResult.setCode("200");
        objectJsonResult.setMessage("SUCCESSFUL");
        objectJsonResult.setData(obj);
        return objectJsonResult;
    }

    public static JsonResult success(){
        JsonResult<Object> objectJsonResult = new JsonResult<>();
        objectJsonResult.setCode("200");
        objectJsonResult.setMessage("SUCCESSFUL");
        return objectJsonResult;
    }

    public static JsonResult error(){
        JsonResult<Object> objectJsonResult = new JsonResult<>();
        objectJsonResult.setCode("-1");
        objectJsonResult.setMessage("ERROR");
        return objectJsonResult;
    }

    public static JsonResult error(String code,String msg){
        JsonResult<Object> objectJsonResult = new JsonResult<>();
        objectJsonResult.setCode(code);
        objectJsonResult.setMessage(msg);
        return objectJsonResult;
    }

}
