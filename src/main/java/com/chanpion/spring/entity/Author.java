package com.chanpion.spring.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author April Chen
 * @date 2021/2/18 14:24
 */
@Data
@Builder
public class Author {
    private Integer id;
    private String name;
    private Integer age;
}
