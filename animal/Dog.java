package animal;

public class Dog extends Animal {
    private static int counterDog = 0;

    public Dog(String name) {
        super(name);
        counterDog++;
    }

    @Override
    public void run(int distance) {
        int maxDistanceRun = 500;
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else if (distance > maxDistanceRun) {
            System.out.println("Слишком далеко");
        } else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        int maxDistanceSwim = 10;
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else if (distance > maxDistanceSwim) {
            System.out.println("Слишком далеко");
        } else super.swim(distance);
    }

    public static void getCounterDog() {
        if (counterDog % 10 == 1 && counterDog % 100 != 11) {
            System.out.println(counterDog + " собака");
        } else if ((counterDog % 10 >= 2 && counterDog % 10 <= 4) && !(counterDog % 100 >= 12 && counterDog % 100 <= 14)) {
            System.out.println(counterDog + " собаки");
        } else {
            System.out.println(counterDog + " собак");
        }
    }
}
