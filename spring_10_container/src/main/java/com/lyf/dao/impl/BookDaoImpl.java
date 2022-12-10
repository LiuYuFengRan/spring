package com.lyf.dao.impl;

import com.lyf.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public BookDaoImpl() {
        System.out.println("constructor");
    }

    public void save() {
        System.out.println("book dao save ..." );
    }
}
