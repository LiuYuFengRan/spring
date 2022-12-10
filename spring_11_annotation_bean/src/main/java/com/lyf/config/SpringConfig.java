package com.lyf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//声明当前类为Spring配置类,用此类代替配置文件
@Configuration
//设置bean扫描路径，多个路径书写为字符串数组格式
@ComponentScan({"com.lyf.service", "com.lyf.dao"})
public class SpringConfig {
}
