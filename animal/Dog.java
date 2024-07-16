package animal;

public class Dog extends Animal {
    private int maxDistanceRun = 500;
    private int maxDistanceSwim = 10;
    private static int counterDog = 0;

    public Dog(String name) {
        super(name);
        counterDog++;
    }

    @Override
    public void run(int distance) {
        if (distance > maxDistanceRun) {
            System.out.println("Слишком далеко");
        } else super.run(distance);
    }


    @Override
    public void swim(int distance) {
        if (distance > maxDistanceSwim) {
            System.out.println("Слишком далеко");
        } else super.swim(distance);
    }

    public static int getCounterDog() {
        return counterDog;
    }
}
