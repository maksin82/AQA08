package animal;

public class Animal {
    private String name;
    private static int counterAnimal = 0;

    public Animal(String name) {
        this.name = name;
        counterAnimal++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + "м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + "м.");
    }

    public static int getAnimalNumber() {
        return counterAnimal;
    }
}
