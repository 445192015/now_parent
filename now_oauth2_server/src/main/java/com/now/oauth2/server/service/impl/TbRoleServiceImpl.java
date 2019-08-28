package com.now.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.now.oauth2.server.domain.TbRole;
import com.now.oauth2.server.mapper.TbRoleMapper;
import com.now.oauth2.server.service.TbRoleService;
@Service
public class TbRoleServiceImpl implements TbRoleService{

    @Resource
    private TbRoleMapper tbRoleMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbRoleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbRole record) {
        return tbRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(TbRole record) {
        return tbRoleMapper.insertSelective(record);
    }

    @Override
    public TbRole selectByPrimaryKey(Long id) {
        return tbRoleMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbRole record) {
        return tbRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbRole record) {
        return tbRoleMapper.updateByPrimaryKey(record);
    }

}
