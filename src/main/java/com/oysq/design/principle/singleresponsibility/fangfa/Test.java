package com.oysq.design.principle.singleresponsibility.fangfa;

import java.util.Arrays;

public class Test {

    // 不符合单一职责原则的几个例子:

    public void updateUser(String name, String age) {

    }

    public void updateUser(String name, String age, String... properties) {
        Arrays.stream(properties).forEach(item -> {
            // 更新多个配置项
        });
    }

    public void updateUser(String name, String age, boolean key) {
        if (key) {
            // do update name
        } else {
            // do update age
        }
    }

    public void updateUser(String name, String age, int key) {
        if (key == 1) {
            // do update name
        } else if (key == 2) {
            // do update age
        }
    }

    // 符合单一职责原则的方式：
    public void updateUserName(String name) {

    }
    public void updateUserAge(String age) {

    }


}
