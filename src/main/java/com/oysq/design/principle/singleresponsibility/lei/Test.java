package com.oysq.design.principle.singleresponsibility.lei;

public class Test {

    public static void main(String[] args) {

        // 不符合单一原则
        new Bird().move("大雁");
        new Bird().move("鸵鸟");

        // 符合单一原则
        new FlyBird().move("大雁");
        new FlyBird().move("鸵鸟");

    }

}
