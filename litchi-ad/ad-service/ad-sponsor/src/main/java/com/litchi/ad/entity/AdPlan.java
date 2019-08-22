package com.litchi.ad.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 广告计划表
 * </p>
 *
 * @author wanglizhi
 * @since 2019-08-22
 */
@Data
public class AdPlan implements Serializable {

    private static final long serialVersionUID = -383063894176366582L;
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 计划名称
     */
    private String planName;
    /**
     * 计划状态
     */
    private Integer planStatus;
    /**
     * 开始时间
     */
    private Integer startDate;
    /**
     * 结束时间
     */
    private Integer endDate;
    private Integer createTime;
    private Integer updateTime;

}
