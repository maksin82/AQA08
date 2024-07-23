package animal;

public class Cat extends Animal {

    private boolean satiety = false;
    private static int counterCat = 0;


    public Cat(String name) {
        super(name);
        counterCat++;
    }

    @Override
    public void run(int distance) {
        int maxDistanceRun = 200;
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else if (distance > maxDistanceRun) {
            System.out.println("Слишком далеко");
        } else super.run(distance);
    }

    @Override
    public void swim(int distance) {
        int maxDistanceSwim = 0;
        if (distance < 0) {
            System.out.println("Отрицательная дистанция");
        } else if (distance > maxDistanceSwim) {
            System.out.println("Кот не умеет плавать");
        } else super.swim(distance);
    }

    public static void getCounterCat() {
        if (counterCat % 10 == 1 && counterCat % 100 != 11) {
            System.out.println(counterCat + " кот");
        } else if ((counterCat % 10 >= 2 && counterCat % 10 <= 4) && !(counterCat % 100 >= 12 && counterCat % 100 <= 14)) {
            System.out.println(counterCat + " кота");
        } else {
            System.out.println(counterCat + " котов");
        }
    }

    public void feedCat(Bowl bowl, int food) {
        if (food > bowl.getFood()) {
            System.out.println("Еды недостаточно!");
        } else {
            satiety = true;
            bowl.setBowl(-food);
            System.out.println(getName() + " - накормлен");
        }
    }

    public void getSatirty() {
        if (satiety) {
            System.out.println(getName() + " - cытый кот");
        } else {
            System.out.println(getName() + " - голодный кот");
        }
    }
}
