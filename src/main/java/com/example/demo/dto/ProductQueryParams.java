package com.example.demo.dto;

import com.example.demo.constant.ProductCategory;

public class ProductQueryParams {
    ProductCategory category;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    String search;
}
