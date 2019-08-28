package com.now.oauth2.server.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.now.oauth2.server.domain.TbUser;
import com.now.oauth2.server.mapper.TbUserMapper;
import com.now.oauth2.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return tbUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TbUser record) {
        return tbUserMapper.insert(record);
    }

    @Override
    public int insertSelective(TbUser record) {
        return tbUserMapper.insertSelective(record);
    }

    @Override
    public TbUser selectByPrimaryKey(Long id) {
        return tbUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TbUser record) {
        return tbUserMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TbUser record) {
        return tbUserMapper.updateByPrimaryKey(record);
    }

    @Override
    public TbUser getByUsername(String username) {
        Example example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", username);
        return tbUserMapper.selectOneByExample(example);
    }

}
