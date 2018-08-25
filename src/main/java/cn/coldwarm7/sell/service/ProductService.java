package cn.coldwarm7.sell.service;

import cn.coldwarm7.sell.dataObject.ProductInfo;
import cn.coldwarm7.sell.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Create by coldwarm on 2018/8/14.
 */

public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询在售商品
     * @return
     */
    List<ProductInfo> findUpAll();

    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);

    //加库存
    void increaseStock(List<CartDTO> cartDTOList) ;

    //减库存
    void decreaseStock(List<CartDTO> cartDTOList);
}
