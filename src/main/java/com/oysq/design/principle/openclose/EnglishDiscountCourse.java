package com.oysq.design.principle.openclose;

/**
 * 打折的英语课
 * 通过继承扩展父类，实现不修改父类的打折效果
 */
public class EnglishDiscountCourse extends EnglishCourse {

    public EnglishDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }

    public double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public double getPrice() {
        return super.getPrice()*0.5;
    }

}
