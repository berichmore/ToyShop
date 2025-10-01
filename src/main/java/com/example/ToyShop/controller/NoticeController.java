package com.example.ToyShop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {


    //공지사항 리스트 페이지
    @GetMapping({"","/"})
    public String notice(){
        return "notice/list";
    }


}
