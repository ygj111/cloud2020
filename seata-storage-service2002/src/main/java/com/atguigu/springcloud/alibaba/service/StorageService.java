package com.atguigu.springcloud.alibaba.service;

/**
 * @Author ygj
 * @Date 2022/1/8 19:29
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
