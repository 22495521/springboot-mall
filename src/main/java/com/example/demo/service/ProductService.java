package com.example.demo.service;

import com.example.demo.dto.ProductQueryParams;
import com.example.demo.dto.ProductRequest;
import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

    Integer countProduct(ProductQueryParams productQueryParams);
}
