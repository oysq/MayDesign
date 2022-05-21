package com.oysq.design.principle.singleresponsibility.lei;

public class Bird {

    public void move(String name) {
        if (name.equals("鸵鸟")) {
            System.out.println(name + " 使用脚走");
        } else if (name.equals("大雁")) {
            System.out.println(name + " 使用翅膀飞");
        } else {
            System.out.println(name + " 使用其他方式");
        }
    }

}
