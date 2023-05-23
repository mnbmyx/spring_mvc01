package com.inspur.ssm.service;

/**
 * @author :myx
 * @date 2023-05-17/0017 19:31
 */

import javax.annotation.Resource;

import com.inspur.ssm.pojo.Userssm;

/**
 * 登录服务类
 * @author zhouyeqin
 *
 */
@Resource
public interface LoginService {
    //用户查询列表
    public Userssm findUser(Userssm userssm)throws Exception;

    public void updateByPrimaryKey(Userssm user);
}
