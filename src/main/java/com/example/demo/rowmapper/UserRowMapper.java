package com.example.demo.rowmapper;

import com.example.demo.constant.ProductCategory;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setUserId(rs.getInt("user_id"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setCreatedDate(rs.getDate("created_date"));
        user.setLastModifiedDate(rs.getDate("last_modified_date"));

        return user;

    }
}
