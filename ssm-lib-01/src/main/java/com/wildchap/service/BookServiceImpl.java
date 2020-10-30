package com.wildchap.service;

import com.wildchap.mapper.BookMapper;
import com.wildchap.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService {

    //service调mapper层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int delteBookById(int id) {
        return bookMapper.delteBookById(id);
    }

    public int updataBook(Books books) {
        return bookMapper.updataBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public Books queryBookByNameAndDetail(String info) {
        return bookMapper.queryBookByNameAndDetail(info);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
