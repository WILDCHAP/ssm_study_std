package com.wildchap.controller;


import com.wildchap.pojo.Books;
import com.wildchap.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //control层调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部书，并返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list", books);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addPage";
    }

    //添加书籍请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>" + books);
        bookService.addBook(books);
        //再次回到首页的时候，首页内容变了，所以要用重定向
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdataBook/{bookID}")
    public String toUpdataPage(@PathVariable int bookID, Model model){
        //修改数据要携带id数据
        model.addAttribute("id", bookID);
        return "updataPage";
    }

    //修改书籍请求
    @RequestMapping("/updataBook")
    public String updataBook(Books books){
        System.out.println("updataBook=>" + books);
        bookService.updataBook(books);
        //再次回到首页的时候，首页内容变了，所以要用重定向
        return "redirect:/book/allBook";
    }

}
