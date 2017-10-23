package com.cxb.service;

import com.cxb.entity.UserInfo;

/**
 * @author ${user}
 * @description
 * @create ${date}
 */
public interface IUserInfoService {

    /**
     * 通过username查找用户信息;
     */
    public UserInfo findByUsername(String username);
}
