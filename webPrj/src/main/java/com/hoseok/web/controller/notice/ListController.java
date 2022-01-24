package com.hoseok.web.controller.notice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ListController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // ViewResolver를 이용해 경로를 간편하게 줄임

        // Tiles를 이용하기위해 notice/list -> notice.list로 변경
        ModelAndView mv = new ModelAndView("notice.list");
        // mv.setViewName("/WEB-INF/view/notice/list.jsp"); 오버로드 생성자 이용

        return mv;
    }

}
