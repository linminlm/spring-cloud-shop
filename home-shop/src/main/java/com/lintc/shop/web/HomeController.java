package com.lintc.shop.web;

import com.lintc.commons.jsonobj.JsonResult;
import com.lintc.commons.utils.ResultUtils;
import com.lintc.moudle.entity.PubUser;
import com.lintc.shop.service.PubUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/28
 * @公司：汽车易生活
 */
@RestController
@RequestMapping("/")
public class HomeController {
    @Autowired
    private PubUserService pubUserService;

    @GetMapping(value = "/{id}")
    public JsonResult home(@PathVariable("id") Long id){
        PubUser pubUser = pubUserService.getPubUser(id);
        return ResultUtils.success(pubUser);
    }

    @GetMapping(value="/list")
    public JsonResult list(){
        List<PubUser> list = pubUserService.getPubUserList();
        return ResultUtils.success(list);
    }
}
