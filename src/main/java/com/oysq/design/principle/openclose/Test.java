package com.oysq.design.principle.openclose;

public class Test {

    public static void main(String[] args) {

        /*
         * 在不修改已存在很久的父类，通过继承扩展父类，实现打折效果
         */

        // 正常的原价
        EnglishCourse englishCourse = new EnglishCourse(1001, "英语", 150D);
        System.out.println(englishCourse.toString());

        // 特殊时期的打折价格
        EnglishCourse iCourse = new EnglishDiscountCourse(1001, "英语", 150D);
        EnglishDiscountCourse discountCourse = (EnglishDiscountCourse) iCourse;
        System.out.println(discountCourse.getPrice() + "  " + discountCourse.getOriginPrice());

    }

}
