package flyweight;
/*
https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm

Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

(Structural pattern)

Flyweight pattern tried to reuse already existing similar kind objects by storing them and
creates new object when no matching object is found.

 We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects.
 Only 5 colors are available so color property is used to check already existing Circle objects

 */
public class FlyweightPatternDemo {
    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        double rand = Math.random();
//        System.out.println(rand);
        int index = (int)(rand*colors.length);
//        System.out.println(index);
        return colors[index];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
