package cn.coldwarm7.sell.service;

import cn.coldwarm7.sell.dto.OrderDTO;

/**
 * Create by coldwarm on 2018/8/26.
 */

public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
