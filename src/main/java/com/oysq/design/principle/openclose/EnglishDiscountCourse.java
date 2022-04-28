package com.oysq.design.principle.openclose;

/**
 * 打折的英语课
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
