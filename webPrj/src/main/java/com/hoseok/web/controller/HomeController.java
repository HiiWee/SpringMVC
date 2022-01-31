package com.hoseok.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 서블릿을 이용하지 않고 POJO클래스로 컨트롤러를 구성
@Controller
public class HomeController {
    
    @RequestMapping("/index")
    public String index() {
        return "root.index";
    }

    @RequestMapping("/help")
    public void help() {
        System.out.println("help");
    }
    
    
    

//    @Override
//    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        // ViewResolver를 이용해 경로를 간편하게 줄임
//        ModelAndView mv = new ModelAndView("root.index");
//        // data키워드를 가진 String data를 담음
//        mv.addObject("data", "Hello Spring MVC~");
//        // view에 대한 정보를 담음, 두가지 방법이 있다.
//            // 1. view 객체를 따로 만들어서 설정 : mv.setView(View view);
//            // 2. view의 이름만 담아서 전달 : mv.setViewName(@Nullable String viewName);
//        // mv.setViewName("/WEB-INF/view/index.jsp"); 오버로드 생성자 이용
//        
//        return mv;
//    }

}
