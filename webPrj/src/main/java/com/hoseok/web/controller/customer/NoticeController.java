package com.hoseok.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hoseok.web.entity.Notice;
import com.hoseok.web.service.NoticeService;


@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;
    
    @RequestMapping("list")
    public String list() throws ClassNotFoundException, SQLException {
        List<Notice> list = noticeService.getList(1, "title", "");
        return "notice.list";
    }

    @RequestMapping("detail")
    public String detail() {
        return "notice.detail";
    }
}
