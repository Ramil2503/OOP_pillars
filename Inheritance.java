// parent/base/superclass
class A {
    void method1() {}

    void method2() {}
}

// child/subclass
class B extends A { // inherits parent class and methods
    // no need to write method1 and method2 again, they are inherited
    void method3() {}
    void method4() {}
}
