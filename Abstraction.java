abstract class Car {
    abstract void accelerate();
    abstract void decelerate();
}

interface Bike {
    public void accelerate();
    public void decelerate();
}

// both way of implementation are correct.
// in both of them objects cannnot be created directly from them
// the difference between abstract class and interface is:
// 1. a java class can implement only one abstract class, but several interfaces
// 2. an abstract class can have both abstract unimplemented methods as well as concrete implemented methods
// 3. in an interface methods must be public and abstract. in abstract class there is no such requirement
// to sum up: abstract class is a common base class with some shared functionality. interface is a contract for other classes to implement