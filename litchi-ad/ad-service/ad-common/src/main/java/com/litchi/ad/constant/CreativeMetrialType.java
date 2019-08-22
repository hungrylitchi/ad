package com.litchi.ad.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Type;

/**
 * @ClassName: CreativeMetrialType
 * @Description:
 * @Author: Alan Wang
 * @CreateDate: 2019/8/22 22:32
 * @Version: 1.0
 */
@AllArgsConstructor
@Getter
public enum CreativeMetrialType {
    JPG(1, "jpg"),
    DMP(2, "dmp"),
    MP4(3, "mp4"),
    AVI(4, "avi"),
    TXT(5, "txt"),
    ;
    private int type;
    private String desc;
}
