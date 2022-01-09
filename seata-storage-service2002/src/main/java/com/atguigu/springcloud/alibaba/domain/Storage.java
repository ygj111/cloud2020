package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @Author ygj
 * @Date 2022/1/8 19:05
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}