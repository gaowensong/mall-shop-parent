package com.mall.weixin.service.impl;

import com.mall.weixin.entity.AppEntity;
import com.mall.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@RestController
public class WeiXinAppServiceImpl implements WeiXinAppService {

    @GetMapping("/getApp")
    public AppEntity getApp() {
        return new AppEntity("123456", "zhangsan");
    }
}
