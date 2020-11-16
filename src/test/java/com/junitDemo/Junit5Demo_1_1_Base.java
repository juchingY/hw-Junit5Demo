package com.junitDemo;

import org.junit.jupiter.api.Test;
import com.util.Calculator;

public class Junit5Demo_1_1_Base {
    @Test
    public void addTest(){
        int result = Calculator.add(2,4);
        System.out.println(result);
    }
    @Test
    public void substractTest(){
        int result = Calculator.substract(8,3);
        System.out.println(result);
    }
    @Test
    public void multiplyTest(){
        int result = Calculator.multiply(2,4);
        System.out.println(result);
    }
    @Test
    public void devideTest(){
        int result = Calculator.devide(4,4);
        System.out.println(result);
    }
    @Test
    public void countTest() throws InterruptedException{
        int result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        result = Calculator.count(1);
        System.out.println(result);
    }
}
