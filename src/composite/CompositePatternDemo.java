package composite;
/*
Composite pattern is used where we need to treat a group of objects in similar way as a single object.

This pattern creates a class that contains group of its own objects.
This class provides ways to modify its group of same objects.
 */
public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee ceo = new Employee("John", "ceo", 30000);
        Employee headSales = new Employee("Robert", "Head Sales", 20000);
        Employee headMarketing = new Employee("Michael", "Head Marketing", 20000);

        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println(ceo);

        for (Employee head: ceo.getSubordinates()) {
            System.out.println(head);
            for (Employee teammate : head.getSubordinates()) {
                System.out.println(teammate);
            }
        }

    }
}
