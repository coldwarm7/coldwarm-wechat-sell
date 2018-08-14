package cn.coldwarm7.sell.valueObject;

import lombok.Data;

/**
 * Create by coldwarm on 2018/8/14.
 */
@Data
public class ResultVO<T> {

    //错误码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T data;
}
