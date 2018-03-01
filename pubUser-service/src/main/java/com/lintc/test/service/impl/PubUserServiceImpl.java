package com.lintc.test.service.impl;

import com.lintc.test.dao.PubUserDao;
import com.lintc.test.entity.PubUser;
import com.lintc.test.service.PubUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
@Service
public class PubUserServiceImpl implements PubUserService {

    @Autowired
    private PubUserDao pubUserDao;

    @Override
    public PubUser getOneById(Long id) {
        return pubUserDao.findOne(id);
    }

    @Override
    public List<PubUser> getAll() {
        return pubUserDao.findAll();
    }

    @Override
    public void delById(Long id) {
        pubUserDao.delete(id);
    }

    @Override
    public PubUser updPubUserById(PubUser pubUser) {
        return pubUserDao.save(pubUser);
    }

    @Override
    public PubUser addPubUser(PubUser pubUser) {
        return pubUserDao.save(pubUser);
    }
}
