package com.lintc.test.api;


import com.lintc.test.entity.PubUser;
import com.lintc.test.service.PubUserService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
@RestController
@RequestMapping("/pubUser")
public class PubUserController {
    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private PubUserService pubUserService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public PubUser get(@PathVariable("id") Long id){
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        PubUser category = pubUserService.getOneById(id);
        logger.info("/pubUser/id, host:" + instance.getHost() + ", serviceId: " + instance.getServiceId() + ",PubUser id: " + category.getId() + ",PubUser email: " + category.getEmail());
        return category;
    }
}
