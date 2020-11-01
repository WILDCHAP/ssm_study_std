package com.wildchap.service;

import com.wildchap.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookByID(int id);
    //修改一本书
    int updataBook(Books books);
    //查询一本书
    Books queryBookByID(int id);
    //查询全部书
    List<Books> queryAllBooks();
}
