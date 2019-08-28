package com.now.oauth2.server.service;

import com.now.oauth2.server.domain.TbPermission;

import java.util.List;

public interface TbPermissionService{


    int deleteByPrimaryKey(Long id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);

    List<TbPermission> selectByUserId(Long id);
}
