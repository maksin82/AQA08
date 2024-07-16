import animal.Animal;
import animal.Bowl;
import animal.Cat;
import animal.Dog;
import figure.Circle;
import figure.Rectangle;
import figure.Triangle;

public class Main {
    public static void main(String[] args) {

        System.out.println("_________Task 1_________");
        Animal animal1 = new Animal("Gosha");
        Animal animal2 = new Animal("Grisha");

        animal1.run(200);

        Cat catMax = new Cat("Max");
        catMax.swim(200);

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Murzik");
        cats[1] = catMax;
        cats[2] = new Cat("Murka");
        cats[3] = new Cat("Pushok");
        cats[4] = new Cat("Barsik");

        Bowl bowl = new Bowl();
        bowl.setBowl(100);

        for (Cat cat : cats) {
            cat.feedCat(bowl, 40);
        }
        for (Cat cat : cats) {
            cat.getSatirty();
        }

        Dog dogBobik = new Dog("Бобик");
        dogBobik.swim(10);

        System.out.println(Cat.getCounterCat());
        System.out.println(Animal.getAnimalNumber());

        System.out.println("_________Task 2_________");
        Circle circle = new Circle("red", "black", new double[]{15});
        circle.displayFigure();

        Triangle triangle = new Triangle("green", "white", new double[]{7, 5, 3});
        triangle.displayFigure();

        Rectangle rectangle = new Rectangle("yellow", "braun", new double[]{7, 5});
        rectangle.displayFigure();
    }
}

