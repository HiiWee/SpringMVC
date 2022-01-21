package com.hoseok.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// 서블릿을 이용하지 않고 POJO클래스로 컨트롤러를 구성
public class IndexController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        
        // data키워드를 가진 String data를 담음
        mv.addObject("data", "Hello Spring MVC~");
        // view에 대한 정보를 담음, 두가지 방법이 있다.
            // 1. view 객체를 따로 만들어서 설정 : mv.setView(View view);
            // 2. view의 이름만 담아서 전달 : mv.setViewName(@Nullable String viewName);
        mv.setViewName("/WEB-INF/view/index.jsp");
        
        return mv;
    }

}
