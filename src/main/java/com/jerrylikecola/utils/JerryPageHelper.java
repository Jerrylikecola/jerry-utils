package com.jerrylikecola.utils;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 * @author jerrylikecola(xiaxiang)
 * @date 2020-01-18
 */

public class JerryPageHelper {

    /**
     * 分页小帮手
     * @param page
     * @param size
     * @param list
     * @param <T>
     * @return ts
     */
    public static <T> List<T> pageHelper(int page,int size,List<T> list){
        if (ObjectUtils.isEmpty(list)){
            return null;
        }
        List<T> ts = new ArrayList<T>();
        int length = list.size();
        int firstNumber = (page-1)*size;
        int lastNumber = page*size;
        if (lastNumber>length){
            lastNumber = length;
        }
        for (int i =firstNumber;i<lastNumber;i++){
            ts.add(list.get(i));
        }
        return ts;
    }

    /**
     * 查未知list的长度
     * @param list
     * @param <T>
     * @return total
     */
    public static <T> Integer getTotal(List<T> list){
        if (ObjectUtils.isEmpty(list)){
            return 0;
        }
        return list.size();
    }
}
