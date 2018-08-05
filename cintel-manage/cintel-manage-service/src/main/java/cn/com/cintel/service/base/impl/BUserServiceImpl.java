package cn.com.cintel.service.base.impl;

import cn.com.cintel.mapper.BUserMapper;
import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import cn.com.cintel.service.base.BUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class BUserServiceImpl implements BUserService {

    @Resource
    BUserMapper bUserMapper;

    @Override
    public List<BUser> selectByExample(BUserExample example) {
        return bUserMapper.selectByExample(example);
    }
}
