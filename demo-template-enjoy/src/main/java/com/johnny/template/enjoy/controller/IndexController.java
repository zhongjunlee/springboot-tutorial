package com.johnny.template.enjoy.controller;

import cn.hutool.core.util.ObjectUtil;
import com.johnny.template.enjoy.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * 主页
 * </p>
 *
 * @author Johnny Lee
 * @date Created in 2018-10-11 14:22
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping(value = {"", "/"})
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();

        User user = (User) request.getSession().getAttribute("user");
        if (ObjectUtil.isNull(user)) {
            mv.setViewName("redirect:/user/login");
        } else {
            mv.setViewName("page/index");
            mv.addObject(user);
        }

        return mv;
    }
}
