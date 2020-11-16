package com.junitDemo;

import com.util.Calculator;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Junit5Demo_2_1_AssertAll {
    @Test
    public void addTest(){
        final int result01 = Calculator.add(2,4);
        System.out.println(result01);

        int result02 = Calculator.add(2,4);
        System.out.println(result02);

        int result03 = Calculator.add(2,4);
        System.out.println(result03);
        assertAll("计算结果校验",
                () -> assertEquals(6,result01),
                () -> assertEquals(7,result02),
                () -> assertEquals(6,result03)
        );


    }
    @Test
    public void substractTest(){
        int result = Calculator.substract(8,3);
        assertEquals(5,result);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(2,4);
        assertEquals(8,result);
        System.out.println(result);
    }
    @Test
    public void devideTest(){
        int result = Calculator.devide(4,4);
        assertEquals(1,result);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException{
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        assertEquals(5,result);
        System.out.println(result);
    }
}
