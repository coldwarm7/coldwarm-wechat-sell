package cn.coldwarm7.sell.exception;

import cn.coldwarm7.sell.enums.ResultEnum;

/**
 * Create by coldwarm on 2018/8/25.
 */

public class SellException extends RuntimeException {
    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}