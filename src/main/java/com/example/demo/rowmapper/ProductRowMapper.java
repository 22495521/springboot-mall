package com.example.demo.rowmapper;

import com.example.demo.constant.ProductCategory;
import com.example.demo.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {
    @Override
    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setProductId(rs.getInt("product_id"));
        product.setProductName(rs.getString("product_name"));
        product.setCategory(ProductCategory.valueOf(rs.getString("category")));
        product.setImageUrl(rs.getString("image_url"));
        product.setPrice(rs.getInt("price"));
        product.setStock(rs.getInt("stock"));
        product.setDescription(rs.getString("description"));
        product.setCreatedDate(rs.getDate("created_date"));
        product.setLastModifiedDate(rs.getDate("last_modified_date"));

        return product;

    }
}
