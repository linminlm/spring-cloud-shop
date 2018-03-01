package com.lintc.test.service;

import com.lintc.test.entity.PubUser;

import java.util.List;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
public interface PubUserService {
    PubUser getOneById(Long id);
    List<PubUser> getAll();
    void delById(Long id);
    PubUser updPubUserById(PubUser pubUser);
    PubUser addPubUser(PubUser pubUser);
}
