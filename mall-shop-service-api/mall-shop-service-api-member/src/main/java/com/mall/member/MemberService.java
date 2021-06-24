package com.mall.member;

import com.mall.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@Api(tags = "会员服务接口")
public interface MemberService {
    /**
     * 会员服务接口调用微信接口
     *
     * @return
     */
    @ApiOperation(value = "会员服务接口调用微信接口")
    public AppEntity memberInvokeWeixin();
}
