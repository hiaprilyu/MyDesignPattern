package decorator;
/*
Decorator pattern allows a user to add new functionality to an existing object without alerting its structure.
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality
keeping class methods signature intact.

Implementations:
1) create Shape interface (Shape)
2) create  2 concrete classes (Circle, Rectangle) implementing Shape interface
3) create an abstract class (ShapeDecorator) implementing Shape interface and having Shape object as its instance variable
4) create a concrete  class (RedShapeDecorator) to implement ShapeDecorator
5) DecoratorPatternDemo, our demo class will use RedShapeDecorator to decorate Shape objects
 */

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
