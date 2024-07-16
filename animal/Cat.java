package animal;

public class Cat extends Animal {
    private int maxDistanceRun = 200;
    private int maxDistanceSwim = 0;
    private boolean satiety = false;
    private static int counterCat = 0;


    public Cat(String name) {
        super(name);
        counterCat++;
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
            System.out.println("Кот не умеет плавать");
        } else super.swim(distance);
    }

    public static int getCounterCat() {
        return counterCat;
    }

    public void feedCat(Bowl bowl, int food) {
        if (food > bowl.getFood()) {
            System.out.println("Еды недостаточно!");
        } else {
            satiety = true;
            bowl.setBowl(-food);
            System.out.println("Накормлен");
        }
    }

    public void getSatirty() {
        if (satiety) {
            System.out.println("Сытый кот");
        } else {
            System.out.println("Голодный кот");
        }
    }


}
