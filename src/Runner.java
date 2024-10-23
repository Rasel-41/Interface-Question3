public class Runner {
    public static void main(String[] args) {
        Person[] persons = {
                new Person("Alice", 165),
                new Person("Bob", 180),
                new Person("Charlie", 175),
                new Person("Rasel", 190),
                new Person("Eve", 160)
        };
        double average = Data.averageHeight(persons);
        System.out.println("Average height: " + average + " cm");
        String tallestName = Data.tallestPerson(persons);
        System.out.println("Tallest person: " + tallestName);
    }
    }

