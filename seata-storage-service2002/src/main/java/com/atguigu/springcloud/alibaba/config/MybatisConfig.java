package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author ygj
 * @Date 2022/1/8 18:18
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MybatisConfig {
}
