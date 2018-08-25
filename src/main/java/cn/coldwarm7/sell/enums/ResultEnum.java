package cn.coldwarm7.sell.enums;

import lombok.Getter;

/**
 * Create by coldwarm on 2018/8/25.
 */
@Getter
public enum ResultEnum {

    PRODUCT_NOT_EXIT(10,"商品不存在"),

    PRODUCT_STOCK_ERROR(11,"库存不正确"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }


}
