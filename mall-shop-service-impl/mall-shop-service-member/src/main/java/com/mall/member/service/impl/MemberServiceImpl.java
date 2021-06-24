package com.mall.member.service.impl;

import com.mall.member.feign.WeiXinAppServiceFeign;
import com.mall.member.MemberService;
import com.mall.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@RestController
public class MemberServiceImpl implements MemberService {
    @Autowired
    private WeiXinAppServiceFeign weiXinAppServiceFeign;

    @GetMapping("/memberInvokeWeixin")
    public AppEntity memberInvokeWeixin() {
        return weiXinAppServiceFeign.getApp();
    }
}
