package com.util;

import static java.lang.Thread.*;

/**
 * @version V1.0
 * @author ZZzzzzz
 * @description 测试靶场
 * @Data 2020-11-08
 */

public class Calculator {
    public static int result =0;

    public static int add(int x,int y){
        result =x+y;
        return result;
    }
    public static int count(int x) throws InterruptedException {
        int i=result;
        Thread.sleep(1000);
        result =i+x;
        return result;
    }
    public static int substract(int x,int y){
        result =x-y;
        return result;
    }
    public static int multiply(int x,int y){
        result =x*y;
        return result;
    }
    public static int devide(int x,int y){
        result =x/y;
        return result;
    }
}
