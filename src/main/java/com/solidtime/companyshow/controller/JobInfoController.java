package com.solidtime.companyshow.controller;

import com.solidtime.companyshow.bean.JobInfo;
import com.solidtime.companyshow.services.JobInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/27-18:02
 */
@Controller
public class JobInfoController {
    @Autowired
    JobInfoService jobInfoService;

    @ResponseBody
    @RequestMapping(value = "/jobinfos",method= RequestMethod.GET)
    public List<JobInfo> getAllJobInfo(){

        return jobInfoService.getJobInfos();
    }

    @ResponseBody
    @RequestMapping(value = "/jobinfo/{id}",method = RequestMethod.GET)
    public JobInfo getJobInfoById(@PathVariable("id") Integer id){
        return jobInfoService.getJobInfoById(id);
    }
}
