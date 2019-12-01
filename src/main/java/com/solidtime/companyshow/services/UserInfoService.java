package com.solidtime.companyshow.services;

import com.solidtime.companyshow.bean.UserInfo;
import com.solidtime.companyshow.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/30-6:25
 */
@Service
public class UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    public UserInfo getUserInfoById(Integer id){
        return userInfoDao.getUserInfoById(id);
    }

    public List<UserInfo> getUserInfos(){
        return userInfoDao.getUserInfos();
    }

    public int insertUserInfo(UserInfo userInfo){
        return userInfoDao.insertUserInfo(userInfo);
    }

    public int deleteUserInfo(Integer id){
        return userInfoDao.deleteUserInfo(id);
    }

    public int updateUserInfo(UserInfo userInfo){
        return userInfoDao.updateUserInfo(userInfo);
    }
}
