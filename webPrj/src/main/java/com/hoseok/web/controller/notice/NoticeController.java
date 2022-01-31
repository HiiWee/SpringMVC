package com.hoseok.web.controller.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
    
    @RequestMapping("/notice/list")
    public String list() {
        return "notice.list";
    }

    @RequestMapping("/notice/detail")
    public String detail() {
        return "notice.detail";
    }
}
