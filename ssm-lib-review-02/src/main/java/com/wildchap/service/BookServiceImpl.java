package com.wildchap.service;

import com.wildchap.mapper.BookMapper;
import com.wildchap.pojo.Books;

import java.util.List;

public class BookServiceImpl implements BookService{

    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookByID(int id) {
        return bookMapper.deleteBookByID(id);
    }

    public int updataBook(Books books) {
        return bookMapper.updataBook(books);
    }

    public Books queryBookByID(int id) {
        return bookMapper.queryBookByID(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
