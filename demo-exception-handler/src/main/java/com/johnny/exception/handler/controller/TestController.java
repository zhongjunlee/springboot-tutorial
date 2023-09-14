package com.johnny.exception.handler.controller;

import com.johnny.exception.handler.constant.Status;
import com.johnny.exception.handler.exception.JsonException;
import com.johnny.exception.handler.exception.PageException;
import com.johnny.exception.handler.model.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-10-02 20:49
 */
@Controller
public class TestController {

    @GetMapping("/json")
    @ResponseBody
    public ApiResponse jsonException() {
        throw new JsonException(Status.UNKNOWN_ERROR);
    }

    @GetMapping("/page")
    public ModelAndView pageException() {
        throw new PageException(Status.UNKNOWN_ERROR);
    }
}
