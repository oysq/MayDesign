
# 设计原则

## 开闭原则

### 定义
> 一个软件实体，如类、模块和函数，应该对扩展开放，对修改关闭。

### 解读
1. 用抽象构建框架，用实现扩展细节
2. 可以不停扩展新功能，但是旧功能不修改，提高系统稳定性
3. 优点：提高软件系统的可复用性和可维护

### coding

> package com.oysq.design.principle.openclose;

---

## 依赖倒置原则

### 定义
> 高层软件不应该依赖低层模块，二者都应该依赖其抽象
> 
> 高层是一个相对的概念，例如在 MVC 模型中，controller 层相对 service 层是高的，service 层相对 dao 层是高的

### 解读
1. 抽象不应该依赖细节，细节应该依赖抽象
2. 针对接口编程，不要针对实现编程
3. 优点：减少类之间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的的风险

## 单一职责原则

## 接口隔离原则

## 迪米特原则

## 里式替换原则

## 合成复用原则















