package animal;

public class Animal {
    private String name;
    private static int counterAnimal = 0;

    public Animal(String name) {
        this.name = name;
        counterAnimal++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else
            System.out.println(getName() + " пробежал " + distance + "м.");
    }

    public void swim(int distance) {
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else
            System.out.println(getName() + " проплыл " + distance + "м.");
    }

    public static void getAnimalNumber() {
        System.out.println(Animal.class.getSimpleName() + " - " + counterAnimal + " шт");
    }
}
