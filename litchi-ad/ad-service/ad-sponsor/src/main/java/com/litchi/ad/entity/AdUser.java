package com.litchi.ad.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author wanglizhi
 * @since 2019-08-22
 */
@Data
public class AdUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * token
     */
    private String token;
    private Integer createTime;
    private Integer updateTime;

}
