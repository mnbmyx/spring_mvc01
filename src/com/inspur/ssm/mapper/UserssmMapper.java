package com.inspur.ssm.mapper;

/**
 * @author :myx
 * @date 2023-05-17/0017 19:33
 */


import java.util.List;
import java.util.Map;

import com.inspur.ssm.pojo.Userssm;

public interface UserssmMapper {
    int deleteByPrimaryKey(String id);

    int insert(Userssm record);

    int insertSelective(Userssm record);

    Userssm selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Userssm record);

    int updateByPrimaryKey(Userssm record);

    Userssm findUser(Userssm userssmQuery);

    // .....
    public List<Userssm> getUserList(Map<String,Object> params);
    //分页总条数
    public Long getCounts(Map<String,Object> p);
}