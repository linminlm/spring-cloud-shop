package com.lintc.shop.service;

import com.lintc.moudle.entity.PubUser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
@Service
public class PubUserService {
    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getPubUserFallback")
    public PubUser getPubUser(Long id) {
        return restTemplate.getForEntity("http://PUBUSER-SERVICE/pubUser/" + id, PubUser.class).getBody();
    }
    private PubUser getCategoryFallback(Long id) {
        // throw new ServiceUnAvailableException("CATEGORY-SERVICE");
        logger.error("PUBUSER-SERVICE unavailable");
        return new PubUser();
    }
}
