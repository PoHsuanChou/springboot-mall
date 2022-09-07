package com.example.demo.dto;

import com.example.demo.constant.ProductCategory;

public class ProductQueryParams {
    private ProductCategory category;
    private String search;


    public ProductCategory getCategory() {
        return category;
    }

    public String getSearch() {
        return search;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public void setSearch(String search) {
        this.search = search;
    }
}
