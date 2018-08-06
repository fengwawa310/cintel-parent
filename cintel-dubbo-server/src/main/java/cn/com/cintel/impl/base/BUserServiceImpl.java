package cn.com.cintel.impl.base;

import cn.com.cintel.mapper.BUserMapper;
import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import cn.com.cintel.service.base.BUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BUserServiceImpl implements BUserService {

    @Resource
    BUserMapper bUserMapper;

    @Override
    public List<BUser> selectByExample(BUserExample example) {
        return bUserMapper.selectByExample(example);
    }
}
