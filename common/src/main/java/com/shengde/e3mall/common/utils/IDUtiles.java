package com.shengde.e3mall.common.utils;

import java.util.Random;

public class IDUtiles {

    /**
     * 商品id生成
     *
     */
    public static long genItemId(){

        //取当前时间的长整型值包含毫秒
        long mills = System.currentTimeMillis();
        //加上两位随机数
        Random random = new Random();
        int end2 = random.nextInt(99);
        //如果不足两位前面补0
        String str = mills + String.format("%02d",end2);
        Long id = new Long(str);
        return id;
    }

    public static void main(String[] args){
        for (int i = 0; i < 100 ; i++)
        System.out.println(genItemId());

    }
}
