package figure;

public interface Perimetr {
    default double calculatePerimeter(double[] arr) {
        double perimeter = 0;
        for (double a : arr) {
            perimeter += a;
        }
        return perimeter;
    }
}
