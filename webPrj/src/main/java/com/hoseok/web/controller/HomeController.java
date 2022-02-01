package com.hoseok.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 서블릿을 이용하지 않고 POJO클래스로 컨트롤러를 구성
@Controller
@RequestMapping("/")
public class HomeController {
        
    // 1. 서블릿 객체를 이용해 문자열 출력
    @RequestMapping("hello1")
    public void index(HttpServletResponse response) {
        PrintWriter out;
        try {
            out = response.getWriter();
            out.println("Hello Index");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return "root.index";
    }
    // 2. @ResponseBody 설정을 통한 문자열 출력하기
    @RequestMapping("hello2")
    @ResponseBody
    public String hello() {
        return "Hello Index!!";
    }
    
    // 3. ResourceViewResolver를 이용한 문서 출력하기(index.jsp의 main부분만 출력됨)
    @RequestMapping("index")
    public void index2() {
    }
    
    // 4. TilesViewResolver를 이용한 문서 출력하기
    @RequestMapping("index2")
    public String index3() {
        return "root.index";
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
