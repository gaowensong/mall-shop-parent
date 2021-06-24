package com.mall.weixin.service;

import com.mall.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@Api(tags = "微信服务接口")
public interface WeiXinAppService {
    /**
     * 功能说明： 应用服务接口
     */
    @GetMapping("/getApp")
    @ApiOperation("查询微信应用接口")
    public AppEntity getApp();
}
