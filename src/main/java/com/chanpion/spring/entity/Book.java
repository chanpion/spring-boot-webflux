package com.chanpion.spring.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author April Chen
 * @date 2021/2/18 14:24
 */
@Data
@Builder
public class Book {
    private Integer id;
    private String name;
    private Author author;
    private String publisher;
}
