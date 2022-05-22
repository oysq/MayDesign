
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
> 
> 在不修改已存在很久的父类，通过继承扩展父类，实现新的打折效果，可以保证旧的模块不受影响，具有稳定性

---

## 依赖倒置原则

### 定义
> 高层软件不应该依赖低层模块，二者都应该依赖它们之间约定好的抽象

### 解读
1. 高层是一个相对的概念，例如在 MVC 模型中，controller 层相对 service 层是高的，service 层相对 dao 层是高的
2. 通常我们说的都是低层的东西不应该依赖高层的业务，但这里的思考角度反回来了，所以叫依赖倒置
3. 抽象可以是接口，也可以是抽象类
4. 抽象不应该依赖细节，应是细节去依赖抽象 
5. 针对接口编程，不要针对实现编程
6. 优点：减少类之间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的的风险

### coding

> package com.oysq.design.principle.dependence;
> 
> `CarShop` 类相对于 `DaZhongCar` 或者` BenChiCar` 而言，属于高层模块，所以不应该依赖于它们
> 
> 解决的方式是：通过面向接口编程，接口属于一种约定，通过 `ICar` 接口的约定，把它们之间解耦开，可以看到 `CarShop` 甚至没有引用到任何 `ICar` 的具体实现类的包
> 
> 从不管需要多少种低层的 `ICar` 实现都不需要修改高层的 `CarShop` 这个角度来看，符合了依赖倒置原则
> 
> 同时，从使用方式角度来看，又符合了开闭原则，后续 `Test` 使用 `CarShop` 的时候，可以在低层通过扩展 `ICar` 的实现，得到不同的效果，不再需要修改 `CarShop` 类


---

## 单一职责原则

### 定义

> 不要存在多于一个导致类变更的原因

### 解读
1. 一个类/接口/方法只负责一项职责
2. 优点：降低类的复杂度，提高类的可读性，提高系统的可维护性，降低变更引起的风险
3. 注意：实际开发中，因为考虑到项目的进度、开发者的水平，或者是完全遵守可能导致的类爆炸（太多的类），所以只能是尽量遵守，而不是完全执行

### coding

> package com.oysq.design.principle.singleresponsibility

1. 类形式的：
   * 不符合的例子：可以看到每次有不同的鸟类传入，`Bird` 类都需要增加 if 逻辑，可能会影响到其它鸟类的逻辑
   * 符合的例子：将 if 拆成不同的鸟类（ `WalkBird`，`FlyBird` ），有新的鸟类就加新的类，这样就不会影响到其它鸟类的逻辑
   * 注意：在类形式的例子上和开闭原则在行为上很像，在接口和方法的形式上区分较大

2. 接口形式：
   * 不符合的例子：可以看到 `IOrder` 接口的设计上，管理和查询的方法都在同一个接口内，只要继承了这个接口，则管理和查询的逻辑必然在同一个类中，而管理的查询的代码可能会有冲突的地方，比如方法的重名等等
   * 符合的例子：将管理和查询的方法拆到不同的接口 `IOrderQuery`，`IOrderManage`，实现类可以同时继承两个接口实现所有功能，也可以只继承某个接口实现某个模块的功能，达到可用性
   * 注意：不要被本例子举例的查询和管理所影响和限制，也有可能是基础方法和高级方法、必要方法和不必要方法等等的解耦，不一定指查询和管理
   
3. 方法形式：
   * 不符合的例子：传入标志位指定更新不同的字段、或者可变长度的入参、传入对象，虽然都能解决固定入参不好扩展的问题，但是后续添加新字段都会使得方法职责愈加复杂
   * 符合的例子：一个方法负责一个字段的更新，互不影响
   * 注意：这里举的例子职责范围是一个字段，不要被限制住，范围可以更小或者更大，如每个方法负责不同模块、或者不同业务、或者不同算法等等，重点是职责区分开，不要被其他人影响


## 接口隔离原则

## 迪米特原则

## 里式替换原则

## 合成复用原则















