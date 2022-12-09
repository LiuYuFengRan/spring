package com.lyf.factory;

import com.lyf.dao.UserDao;
import com.lyf.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//FactoryBean创建对象
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //代替原始实例工厂中创建对象的方法
    /*获取bean实例对象*/
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    /*指明对象何种类型*/
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    public boolean isSingleton() {
        return true;//返回true则代表实例化单例对象
    }
}
