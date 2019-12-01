package com.solidtime.companyshow.dao;

import com.solidtime.companyshow.bean.UserInfo;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/30-6:21
 */
public interface UserInfoDao {
    //根据id获取【用户信息】
    UserInfo getUserInfoById(Integer id);
    //获取所有【用户信息】
    List<UserInfo> getUserInfos();
    //添加一条【用户信息】
    int insertUserInfo(UserInfo userInfo);
    //删除一条【用户信息】
    int deleteUserInfo(Integer id);
    //更新一条【用户信息】
    int updateUserInfo(UserInfo userInfo);
}
