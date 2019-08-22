package com.litchi.ad.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CommonStatusEnum
 * @Description:
 * @Author: Alan Wang
 * @CreateDate: 2019/8/22 21:15
 * @Version: 1.0
 */
@Getter
@AllArgsConstructor
public enum CommonStatusEnum {
    VALID(1, "有效状态"),
    INVALID(0, "无效状态"),
    ;
    private int status;
    private String desc;


}
