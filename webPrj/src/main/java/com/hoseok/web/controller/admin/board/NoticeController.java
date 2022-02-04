package com.hoseok.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice")
public class NoticeController {
    
    @RequestMapping("list")
    public String list() {
        return "";
    }
    @RequestMapping("reg")
    @ResponseBody
    public String reg() {
        return "reg";
    }
    @RequestMapping("edit")
    public String edit() {
        return "";
    }
    @RequestMapping("del")
    public String del() {
        return "";
    }
}
