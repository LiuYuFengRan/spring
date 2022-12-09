package com.lyf.service.impl;

import com.lyf.dao.BookDao;
import com.lyf.service.BookService;

public class BookServiceImpl implements BookService{
    private BookDao bookDao;

    //必须保留
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }
}
