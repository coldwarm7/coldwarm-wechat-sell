package cn.coldwarm7.sell.dao;

import cn.coldwarm7.sell.dataObject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Create by coldwarm on 2018/8/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterDaoTest {

    @Autowired
    private OrderMasterDao orderMasterDao;

    @Test
    public void findByBuyerOpenid() {
        PageRequest request = new PageRequest(0,1);

        Page<OrderMaster> result = orderMasterDao.findByBuyerOpenid("123456",request);
        System.out.println(result.getTotalElements());
    }
}