package com.mutual.cmt.controller;

import com.mutual.cmt.dto.PaginationDTO;
import com.mutual.cmt.dto.QuestionDTO;
import com.mutual.cmt.mapper.QuestionMapper;
import com.mutual.cmt.mapper.UserMapper;
import com.mutual.cmt.model.Question;
import com.mutual.cmt.model.User;
import com.mutual.cmt.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yyuanyan
 * @create 2019 - 10 - 04 - 16:44
 */
@Controller
public class IndexController {
    @Autowired
    private QuestionService questionService;
    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page",defaultValue = "1") Integer page,
                        @RequestParam(name = "size",defaultValue = "5") Integer size ){
        PaginationDTO pagination = questionService.list(page,size);
        model.addAttribute("pagination",pagination);
        return "index";
    }
}
