package com.lintc.test.dao;

import com.lintc.test.entity.PubUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/2/27
 * @公司：汽车易生活
 */
@Repository
public interface PubUserDao extends JpaRepository<PubUser, Long> {
}
