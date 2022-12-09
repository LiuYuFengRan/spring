package com.lyf;

import com.lyf.dao.BookDao;
import com.lyf.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookDao bookDao1 =(BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 =(BookDao) ctx.getBean("bookDao");

        /*scope="singleton"时*/
       /* System.out.println(bookDao1);*//*com.lyf.dao.impl.BookDaoImpl@25bbe1b6*//*
        System.out.println(bookDao2);*//*com.lyf.dao.impl.BookDaoImpl@25bbe1b6*/

        /*scope="prototype"时*/
        System.out.println(bookDao1);/*com.lyf.dao.impl.BookDaoImpl@25bbe1b6*/
        System.out.println(bookDao2);/*com.lyf.dao.impl.BookDaoImpl@5702b3b1*/



    }
}
