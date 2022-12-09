package com.lyf.factory;

import com.lyf.dao.UserDao;
import com.lyf.dao.impl.UserDaoImpl;
//实例工厂创建对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
