package com.lyf.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lyf")
//@Import:导入配置信息
@Import({JdbcConfig.class})
public class SpringConfig {
}
