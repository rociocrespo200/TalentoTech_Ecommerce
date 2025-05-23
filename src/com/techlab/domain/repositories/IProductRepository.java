package com.techlab.domain.repositories;

import java.util.ArrayList;

import com.techlab.domain.models.Category;
import com.techlab.domain.models.Product;

public interface IProductRepository {

    void createProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(Integer id);
    Product findById(Integer id);
    Product findByCategory(Category category);
    ArrayList<Product> getAllProducts();
}
