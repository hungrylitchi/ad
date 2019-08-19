package com.litchi.ad.advice;

import com.litchi.ad.exception.AdException;
import com.litchi.ad.vo.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: GlobalExceptionAdvice
 * @Description:
 * @Author: Alan Wang
 * @CreateDate: 2019/8/19 20:33
 * @Version: 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = {AdException.class})
    CommonResponse<String> handler(HttpServletRequest request, AdException ex) {
        log.warn("", ex);
        return new CommonResponse<>(-1, "business error", ex.getMessage());
    }
}
