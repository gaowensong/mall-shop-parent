package com.mall.member.feign;

import com.mall.weixin.service.WeiXinAppService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@FeignClient(name = "app-mall-weixin")
public interface WeiXinAppServiceFeign extends WeiXinAppService {
}
