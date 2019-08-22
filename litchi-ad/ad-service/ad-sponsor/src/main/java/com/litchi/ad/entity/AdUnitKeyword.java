package com.litchi.ad.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 广告单元限制表
 * </p>
 *
 * @author wanglizhi
 * @since 2019-08-22
 */
@Data
public class AdUnitKeyword implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 单元id
     */
    private Long unitId;
    /**
     * 关键字
     */
    private String keyword;
    private Integer creatTime;
    private Integer updateTime;

}
