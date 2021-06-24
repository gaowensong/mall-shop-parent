package com.mall.weixin.entity;

import lombok.Data;

/**
 * @author gaowensong
 * @date 2021/5/31
 */
@Data
public class AppEntity {

    /**
     * appid
     */
    private String appId;
    /**
     * 应用名称
     */
    private String appName;

    public AppEntity() {

    }

    public AppEntity(String appId, String appName) {
        super();
        this.appId = appId;
        this.appName = appName;
    }
}
