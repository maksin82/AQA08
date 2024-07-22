import animal.Bowl;
import animal.Cat;
import animal.Dog;
import figure.Circle;
import figure.Rectangle;
import figure.Triangle;

public class Main {
    public static void main(String[] args) {
      
        System.out.println("_________Task 1_________");

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Мурзик");
        cats[1] = new Cat("Семка");
        cats[2] = new Cat("Мурка");
        cats[3] = new Cat("Пушок");
        cats[4] = new Cat("Барсик");

        cats[0].swim(200);
        Cat.getCounterCat();


        Dog dogBobik = new Dog("Бобик");
        dogBobik.swim(5);

        Dog.getCounterDog();

        System.out.println("_________Task 2_________");

        Circle circle = new Circle("red", "black", new double[]{14});
        circle.displayFigure();

        Triangle triangle = new Triangle("green", "white", new double[]{7, 5, 3});
        triangle.displayFigure();

        Rectangle rectangle = new Rectangle("yellow", "braun", new double[]{7, 5});
        rectangle.displayFigure();
    }
}