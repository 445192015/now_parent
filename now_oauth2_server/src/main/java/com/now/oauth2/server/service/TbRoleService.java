package com.now.oauth2.server.service;

import com.now.oauth2.server.domain.TbRole;
public interface TbRoleService{


    int deleteByPrimaryKey(Long id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);

}
