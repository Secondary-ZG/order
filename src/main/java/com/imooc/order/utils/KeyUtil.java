package com.imooc.order.utils;

import java.util.Random;

/**
 * Java Class
 * Created By Secondary
 * On 2019/8/21 21:34
 * Description: 生成唯一的主键
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式: 时间+随机数
     * @return
     */
    public static synchronized String genUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }

}
