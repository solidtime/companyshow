package com.solidtime.companyshow.controller;

import com.solidtime.companyshow.bean.LayuiTableData;
import com.solidtime.companyshow.bean.UserInfo;
import com.solidtime.companyshow.services.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/30-6:19
 */
@Controller
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    @ResponseBody
    @RequestMapping(value = "/userinfos",method = RequestMethod.GET)
    public LayuiTableData getAllUserInfo(){
        List<UserInfo> userInfos=userInfoService.getUserInfos();

        LayuiTableData layuiTableData=new LayuiTableData();
        layuiTableData.setCount(userInfos.size());
        layuiTableData.setData(userInfos);

        return layuiTableData;
    }

    @ResponseBody
    @RequestMapping(value = "/userinfos/{id}",method = RequestMethod.DELETE)
    public int deleteUserInfo(@PathVariable("id") int id){
        return userInfoService.deleteUserInfo(id);
    }

    @RequestMapping(value = "/userinfos",method = RequestMethod.POST)
    public int insertUserInfo(UserInfo userInfo){
        return userInfoService.insertUserInfo(userInfo);
    }

    @RequestMapping(value = "/userinfos",method = RequestMethod.PUT)
    public int updateUserInfo(UserInfo userInfo){
        System.out.println(userInfo);
        return userInfoService.updateUserInfo(userInfo);
    }
}
