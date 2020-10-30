package com.wildchap.controller;


import com.sun.xml.internal.bind.v2.model.core.ID;
import com.wildchap.pojo.Books;
import com.wildchap.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
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

//    //跳转到修改书籍页面
//    @RequestMapping("/toUpdataBook")
//    public String toUpdataPage(int id, Model model){
//        //修改数据要携带id数据
//        Books books = bookService.queryBookById(id);
//        model.addAttribute("books", books);
//        return "updataPage";
//    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdataBook/{id}")
    public String toUpdataPage(@PathVariable int id, Model model){
        //修改数据要携带id数据
        Books books = bookService.queryBookById(id);
        model.addAttribute("books", books);
        return "updataPage";
    }

    //修改书籍请求
    @RequestMapping("/updataBook")
    public String updataBook(Books books){
        System.out.println("updataBook=>" + books);
        int i = bookService.updataBook(books);
        if(i > 0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        //再次回到首页的时候，首页内容变了，所以要用重定向
        return "redirect:/book/allBook";
    }

    //直接删除页面(不跳转到新的页面)
    @RequestMapping("/deleteBook/{id}")
    public String toDeletePage(@PathVariable int id, Model model){
        int i = bookService.delteBookById(id);
        if(i > 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return "redirect:/book/allBook";
    }

    //查询书籍(ID)
    @RequestMapping("/queryBook")
    public String queryBookById(int bookID, Model model){
        Books books = bookService.queryBookById(bookID);
        model.addAttribute("books", books);
        return "queryPage";
    }

    //查询书籍(Name和Detail)
    @RequestMapping("/queryBook2")
    public String queryBookByNameAndDetail(String info, Model model){
        System.out.println(info);
        Books book = bookService.queryBookByNameAndDetail(info);
        System.out.println(book);
        List<Books> books = new ArrayList<Books>();
        books.add(book);
        System.out.println(books);
        model.addAttribute("list", books);
        return "queryPage2";
    }
}
