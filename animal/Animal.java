package animal;

abstract class Animal {

    private final String name;
    private static int counterAnimal = 0;

    public Animal(String name) {
        this.name = name;
        counterAnimal++;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }

    public static void getAnimalNumber() {
    }

}
