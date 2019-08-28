package com.now.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.now.oauth2.server.mapper.TbPermissionMapper;
import com.now.oauth2.server.domain.TbPermission;
import com.now.oauth2.server.service.TbPermissionService;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbPermissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbPermission record) {
        return tbPermissionMapper.insert(record);
    }

    @Override
    public int insertSelective(TbPermission record) {
        return tbPermissionMapper.insertSelective(record);
    }

    @Override
    public TbPermission selectByPrimaryKey(Long id) {
        return tbPermissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbPermission record) {
        return tbPermissionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbPermission record) {
        return tbPermissionMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<TbPermission> selectByUserId(Long id) {

        return tbPermissionMapper.selectByUserId(id);
    }

}
