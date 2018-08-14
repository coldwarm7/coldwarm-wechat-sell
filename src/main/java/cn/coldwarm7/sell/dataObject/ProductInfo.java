package cn.coldwarm7.sell.dataObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Create by coldwarm on 2018/8/14.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock; //库存
    private String productDescription;
    private String productIcon; //小图
    private Integer productStatus; //商品状态，0正常1下架
    private Integer categoryType; //类目编号
}
