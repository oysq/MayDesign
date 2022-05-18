package com.oysq.design.principle.dependence;

public class Test {

    public static void main(String[] args) {

        // 第一版：传参
//        CarShop carShop = new CarShop();
//        carShop.byCar(new DaZhongCar());
//        carShop.byCar(new BenChiCar());

        // 第二版：构造器
//        CarShop dzCarShop = new CarShop(new DaZhongCar());
//        dzCarShop.byCar();
//        CarShop bzCarShop = new CarShop(new BenChiCar());
//        bzCarShop.byCar();

        // 第三版：setter
        CarShop carShop = new CarShop();
        carShop.setiCar(new DaZhongCar());
        carShop.byCar();
        carShop.setiCar(new BenChiCar());
        carShop.byCar();

    }

}
