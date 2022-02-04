package com.hoseok.web.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hoseok.web.entity.Notice;
import com.hoseok.web.service.NoticeService;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("list")
    public String list(@RequestParam(name = "p", defaultValue = "1") int page /* HttpServletRequest request */) throws ClassNotFoundException, SQLException {
        //String p = request.getParameter("p");
        System.out.println("page : " + page);
        // List<Notice> list = noticeService.getList(1, "title", "");
        return "notice.list";
    }

    @RequestMapping("detail")
    public String detail() {
        return "notice.detail";
    }
}
