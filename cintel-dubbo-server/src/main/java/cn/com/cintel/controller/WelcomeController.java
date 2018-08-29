package cn.com.cintel.controller;

import cn.com.cintel.impl.jedis.BasicRedisImp;
import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import cn.com.cintel.service.base.BUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.security.cert.Certificate;
import java.util.List;

@RestController
public class WelcomeController {

    @Resource
    private BUserService bUserService;
    @Resource
    BasicRedisImp basicRedisImp;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        BUserExample bUserExample = new BUserExample();
        bUserExample.createCriteria().andIDEqualTo("1");
        //获取列表页
        List<BUser> list = bUserService.selectByExample(bUserExample);
        System.out.println("==================="+list.size());
        return "list";
    }

    @RequestMapping(value = "/testRedis")
    public void testRedis(){
        basicRedisImp.saveString("haha","haha");
        System.out.println(basicRedisImp.getJedis().get("haha"));
        System.out.println(basicRedisImp.existKey("haha"));
        System.out.println(basicRedisImp.updateKey("haha","aiai"));
        System.out.println(basicRedisImp.getJedis().get("haha"));
        basicRedisImp.removeKey("haha");
        System.out.println(basicRedisImp.existKey("haha"));
    }


}
