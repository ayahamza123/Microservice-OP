package com.ecommerce.microcommerce.DAO;


import com.ecommerce.microcommerce.module.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll();
    Product findById(int id);
    Product save(Product product);
}
