package Poly;

public class Main {
    public static void main() {
        Calculator c = new Calculator();

        // Method Overloading
        int ans = c.add(2,3);
        System.out.println(ans);
        int ans1 = c.add(2,3,4);
        System.out.println(ans1);

        // this is also polymorphic because shape also have shape method it behave differently depending upon which we call
        Circle circle = new Circle();
//        circle.draw();
        doDrawing(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
    public static void doDrawing(Shape s){
        s.draw();
    }
}
