package com.wildchap.controller;


import com.wildchap.pojo.Books;
import com.wildchap.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookControl {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部图书
    @RequestMapping("/allBooks")
    public String list(Model model){
        List<Books> books = bookService.queryAllBooks();
        model.addAttribute("books", books);
        return "allBooks";
    }

}
