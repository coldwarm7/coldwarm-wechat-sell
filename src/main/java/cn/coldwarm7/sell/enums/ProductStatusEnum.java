package cn.coldwarm7.sell.enums;

import lombok.Getter;

/**
 * 商品状态
 * Create by coldwarm on 2018/8/14.
 */
@Getter
public enum ProductStatusEnum {

    UP(0,"在售"),
    DOWN(1,"下架")
    ;
    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
