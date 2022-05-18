package com.oysq.design.principle.dependence;

public class CarShop {

    private ICar iCar;

    public void setiCar(ICar iCar) {
        this.iCar = iCar;
    }

    public void byCar() {
        iCar.showPrice();
    }

}
