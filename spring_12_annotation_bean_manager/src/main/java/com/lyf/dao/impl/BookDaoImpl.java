package com.lyf.dao.impl;

import com.lyf.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
//@Scope设置bean的作用范围
/*singleton为单例，prototype为非单例*/
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save ...");
    }

    //@PostConstruct设置bean的初始化方法
    @PostConstruct
    public void init() {
        //构造方法后
        System.out.println("init ...");
    }

    //@PreDestroy设置bean的销毁方法
    @PreDestroy
    public void destroy() {
        //销毁前
        System.out.println("destroy ...");
    }

}
