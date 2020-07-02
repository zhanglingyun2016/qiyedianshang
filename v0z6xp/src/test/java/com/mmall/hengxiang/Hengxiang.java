package com.mmall.hengxiang;

import com.mmall.common.TokenCache;

import java.util.UUID;

public class Hengxiang {
    public static void main(String[] args) {
        rand("张三");
    }



    public static void rand(String username){

        String str = UUID.randomUUID().toString();
        System.out.println(str);

        TokenCache.setKey("1"+username,str);
    }

}
