package cn.coldwarm7.sell.controller;

import cn.coldwarm7.sell.dataObject.ProductCategory;
import cn.coldwarm7.sell.dataObject.ProductInfo;
import cn.coldwarm7.sell.service.CategoryService;
import cn.coldwarm7.sell.service.ProductService;
import cn.coldwarm7.sell.util.ResultVOUtil;
import cn.coldwarm7.sell.valueObject.ProductInfoVO;
import cn.coldwarm7.sell.valueObject.ProductVO;
import cn.coldwarm7.sell.valueObject.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by coldwarm on 2018/8/14.
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResultVO list(){
        List<ProductInfo> productInfoList = productService.findUpAll();
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(e-> e.getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList){
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList){
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo,productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }
}
