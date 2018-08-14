package cn.coldwarm7.sell.service.impl;

import cn.coldwarm7.sell.dataObject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Create by coldwarm on 2018/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
    }

    @Test
    public void findAll(){
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfos = productService.findAll(request);
        Assert.assertNotEquals(0,productInfos.getTotalElements());
    }
}