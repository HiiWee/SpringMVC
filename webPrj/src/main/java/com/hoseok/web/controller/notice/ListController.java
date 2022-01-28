package com.hoseok.web.controller.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hoseok.web.entity.Notice;
import com.hoseok.web.service.NoticeService;

public class ListController implements Controller {
    
    @Autowired
    private NoticeService noticeService;
    //@Autowired로 자동 바인딩 되므로 Setter가 없어도 됨
    //    @Autowired
    //    public void setNoticeService(NoticeService noticeService) {
    //        this.noticeService = noticeService;
    //    }

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // ViewResolver를 이용해 경로를 간편하게 줄임
        // Tiles를 이용하기위해 notice/list -> notice.list로 변경
        ModelAndView mv = new ModelAndView("notice.list");
        // mv.setViewName("/WEB-INF/view/notice/list.jsp"); 오버로드 생성자 이용

        List<Notice> list = noticeService.getList(1, "title", "");
        mv.addObject("list", list);
        return mv;
    }

}
