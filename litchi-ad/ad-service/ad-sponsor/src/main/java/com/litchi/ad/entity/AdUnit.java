package com.litchi.ad.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 广告单元表
 * </p>
 *
 * @author wanglizhi
 * @since 2019-08-22
 */
@Data
public class AdUnit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 计划id
     */
    private Long planId;
    /**
     * 单元名称
     */
    private String unitName;
    /**
     * 单元状态
     */
    private Integer unitStatus;
    /**
     * 位置类型
     */
    private Integer positionType;
    /**
     * 预算
     */
    private Long budget;
    private Integer creatTime;
    private Integer updateTime;

}
