package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;

/**
 * Java Class
 *
 * @author Secondary
 * @date 2019-09-04 20:11
 * Description: 返回结果集工具类
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
