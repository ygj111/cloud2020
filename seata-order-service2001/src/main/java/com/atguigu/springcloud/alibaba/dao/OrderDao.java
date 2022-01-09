package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author ygj
 * @Date 2022/1/7 23:12
 */
@Mapper
public interface OrderDao {
    //1新建订单
    void create(Order order);

    //2修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
