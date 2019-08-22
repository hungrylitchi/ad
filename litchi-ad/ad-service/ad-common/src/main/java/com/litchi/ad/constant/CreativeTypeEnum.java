package com.litchi.ad.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @ClassName: CreativeTypeEnum
 * @Description:
 * @Author: Alan Wang
 * @CreateDate: 2019/8/22 22:28
 * @Version: 1.0
 */
@Getter
@AllArgsConstructor
public enum CreativeTypeEnum {
    IMAGE(1, "图片"),
    VIDEO(2, "视频"),
    TEXT(3, "文本"),
    ;

    private int type;
    private String desc;
}
