public class Data {public static double averageHeight(Person[] persons) {
    int totalHeight = 0;
    for (Person person : persons) {
        totalHeight += person.getHeight();
    }
    return (double) totalHeight / persons.length;
}
    public static String tallestPerson(Person[] persons) {
        Person tallest = persons[0];
        for (Person person : persons) {
            if (person.getHeight() > tallest.getHeight()) {
                tallest = person;
            }
        }
        return tallest.getName();
    }
}
