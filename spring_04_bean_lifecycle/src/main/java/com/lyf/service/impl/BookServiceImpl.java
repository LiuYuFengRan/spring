package com.lyf.service.impl;

import com.lyf.dao.BookDao;
import com.lyf.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void setBookDao(BookDao bookDao) {
        System.out.println("set .....");
        this.bookDao = bookDao;
    }

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
