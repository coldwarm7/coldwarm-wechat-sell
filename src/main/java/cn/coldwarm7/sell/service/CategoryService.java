package cn.coldwarm7.sell.service;

import cn.coldwarm7.sell.dataObject.ProductCategory;

import java.util.List;

/**
 * Create by coldwarm on 2018/8/14.
 */

public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
