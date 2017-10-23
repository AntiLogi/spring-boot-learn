package com.cxb.dao;

import com.cxb.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ${user}
 * @description
 * @create ${date}
 */
public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}
