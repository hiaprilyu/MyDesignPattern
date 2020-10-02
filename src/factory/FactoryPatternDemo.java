package factory;
/*
https://www.tutorialspoint.com/design_pattern/factory_pattern.htm

Creational pattern, it is pattern provides one of the best ways to create an object
We create object without exposing the creation logic to the client and refer to newly created object using a common interface
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("circle");
        shape3.draw();
    }
}
