package cn.com.cintel.service.base;

import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;

import java.util.List;

public interface BUserService {

    List<BUser> selectByExample(BUserExample example);

}
