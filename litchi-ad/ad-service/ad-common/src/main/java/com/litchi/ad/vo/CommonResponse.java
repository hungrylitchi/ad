package com.litchi.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName: CommonResponse
 * @Description:
 * @Author: Alan Wang
 * @CreateDate: 2019/8/19 19:59
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResponse<T> implements Serializable {

    private static final long serialVersionUID = 7293144120267422479L;
    private Integer code;
    private String message;
    private T data ;

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
