package com.example.ShoppingmallApi.web.dto;

import com.example.ShoppingmallApi.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsReadDto {
    private Long id;
    private String product_name;
    private int price;
    private String product_number;
    private int stock;
    private String category;

    public PostsReadDto(Posts entity){
        this.id = entity.getId();
        this.product_name = entity.getProduct_name();
        this.price = entity.getPrice();
        this.product_number = entity.getProduct_number();
        this.stock = entity.getStock();
        this.category = entity.getCategory();
    }
}