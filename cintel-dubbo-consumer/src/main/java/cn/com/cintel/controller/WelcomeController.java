package cn.com.cintel.controller;

import cn.com.cintel.pojo.BUser;
import cn.com.cintel.pojo.BUserExample;
import cn.com.cintel.service.base.BUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class WelcomeController {

    @Resource
    private BUserService bUserService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        BUserExample bUserExample = new BUserExample();
        bUserExample.createCriteria().andIDEqualTo("1");
        //获取列表页
        List<BUser> list = bUserService.selectByExample(bUserExample);
        return "list"+list.size();
    }


}
