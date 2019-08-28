package com.now.oauth2.server.mapper;

import com.now.oauth2.server.config.mybatis.MyMapper;
import com.now.oauth2.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {

    List<TbPermission> selectByUserId(@Param("userId") Long userId);
}