package com.litchi.ad.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 广告单元兴趣限制表
 * </p>
 *
 * @author wanglizhi
 * @since 2019-08-22
 */
@Data
public class AdUnitIt implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 单元id
     */
    private Long unitId;
    /**
     * 关键字
     */
    private String itTag;
    private Integer creatTime;

}
