package cn.coldwarm7.sell.util;

import cn.coldwarm7.sell.enums.CodeEnum;

/**
 * Create by coldwarm on 2018/8/25.
 */

public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }
}
