package Abstraction;

// Old Way
//abstract class Bird {
//
//    abstract void fly();
//
//    abstract void eat();
//
//    // concrete method iski imple hai
//    public void sleep(){
//        System.out.println("Bird sleeping");
//    }
//}
//
//class Sparrow extends Bird {
//    @Override
//    void fly() {
//        System.out.println("Sparrow flying");
//    }
//
//    @Override
//    void eat() {
//        System.out.println("Sparrow eating");
//    }
//}
//
//class Crow extends Bird {
//    @Override
//    void fly() {
//        System.out.println("Crow flying");
//    }
//    // if this change interface is same
//    @Override
//    void eat() {
//        System.out.println("Crow eating alag way");
//    }
//}

interface Bird {
    // these are by default public
    void fly();

    void eat();

    default void sleep(){
        System.out.println("Bird is sleeping");
    }
}

class Sparrow implements Bird {

    // These methods have to be public because outer world interact
    @Override
    public void fly() {
        System.out.println("Sparrow flying");

    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating alag way");
    }
}

class Crow implements Bird {
    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    // if this change interface is same
    @Override
    public void eat() {
        System.out.println("Crow eating alag way");
    }
}

public class Main {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {
//        Bird b = new Bird(); This abstract class cannot be instantiated
//        Bird b = new Sparrow();
//        b.eat();
//        b.fly();
//
//        b = new Crow();
//        b.eat();
//        b.fly();
        doBirdStuff(new Crow());
        doBirdStuff(new Sparrow());
    }
}
