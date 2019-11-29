package com.solidtime.companyshow.dao;

import com.solidtime.companyshow.bean.JobInfo;

import java.util.List;

/**
 * @Author Soulelement99
 * @Date 2019/11/27-18:01
 */
public interface JobInfoDao {
    //根据id获取JobInfo
    JobInfo getJobInfoById(Integer id);
    //获取所有JobInfo
    List<JobInfo> getJobInfos();
    //插入一条JobInfo记录
    int insertJobInfo(JobInfo jobInfo);
    //修改一条JobInfo记录
    int updateJobInfo(JobInfo jobInfo);
    //删除一条JobInfo记录
    int deleteJobInfoById(Integer id);
}
