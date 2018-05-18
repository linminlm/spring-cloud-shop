package com.example.zuul;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/4/23
 * @公司：汽车易生活
 */
public class TestMain {

    public static void main(String[] args) {
        TestSingleton instance = TestSingleton.getInstance();
        TestSingleton instance1 = TestSingleton.getInstance();
        System.out.println(instance==instance1);
    }
}
