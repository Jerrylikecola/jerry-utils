package com.jerrylikecola.utils.random;

import com.jerrylikecola.utils.JerryRandomUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author xiaxiang
 * @date 2020/6/11 3:07 下午
 * @description help to number
 */

public class NumberHelper {

    /**
     * tip+date+random
     * @param yourTip
     * @return
     */
    public static String getWithYourTipAndNumber(String yourTip){
        return yourTip+JerryRandomUtil.getDateTime()+ RandomStringUtils.random(4,false,true);
    }
}
