package cn.coldwarm7.sell.util;

import java.util.Random;

/**
 * Create by coldwarm on 2018/8/25.
 */

public class KeyUtil {

    //生成唯一的主键
    //格式：时间+随机数
    public static synchronized String genUnique(){
        Random random = new Random();

        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
