package com.now.oauth2.server.service;

import com.now.oauth2.server.domain.TbUser;

public interface TbUserService{

    int deleteByPrimaryKey(Long id);

    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbUser record);

    int updateByPrimaryKey(TbUser record);

    TbUser getByUsername(String username);

}
