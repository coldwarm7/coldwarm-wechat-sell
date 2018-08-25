package cn.coldwarm7.sell.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Create by coldwarm on 2018/8/25.
 */
@Data
@AllArgsConstructor
public class CartDTO {
  private String productId;

  private Integer productQuantity;
}
