package com.lyf.dao.impl;

import com.lyf.dao.BookDao;

public class BookDaoImpl implements BookDao {

    //构造方法
   /* spring创建bean时，调用无参构造方法*/
    public BookDaoImpl() {
        System.out.println("book dao constructor is running ....");
    }

    public void save() {
        System.out.println("book dao save ...");
    }

}
