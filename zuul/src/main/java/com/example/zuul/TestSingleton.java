package com.example.zuul;

/**
 * @项目：testCloud
 * @创建者：linmin
 * @创建时间：2018/4/23
 * @公司：汽车易生活
 */
public class TestSingleton {

    private static class staticClassLazy{
        private static TestSingleton single=new TestSingleton();
    }
    private TestSingleton(){
        if(staticClassLazy.single!=null){
            throw new RuntimeException("这是单例");
        }
    }
    public static synchronized TestSingleton getInstance(){
        return staticClassLazy.single;

    }

}
