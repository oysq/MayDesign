package com.oysq.design.principle.interfacesegregation;

public class Dog implements IAction{
    @Override
    public void eat() {

    }

    @Override
    public void fly() {
        // 无法飞，但是由不得不实现接口
    }

    @Override
    public void swing() {

    }
}
