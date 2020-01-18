package com.jerrylikecola.utils.test;

import com.jerrylikecola.utils.JerryRandomUtil;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author jerrylikecola(xiaxiang)
 * @date 2020-01-18
 */

public class CommonTest {

    public static void main(String[] args) throws InterruptedException {
        while (true) {
            int i = Integer.valueOf(RandomStringUtils.random(4,false,true));
            if (i>5000){
                Thread.sleep(i);
                System.out.println("off work: " + JerryRandomUtil.getTimeWhenOffTime());
            }
        }
    }
}
