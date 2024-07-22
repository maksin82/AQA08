package figure;

public class Circle extends Figure {
    public Circle(String backgroundColor, String borderColor, double[] arr) {
        super(backgroundColor, borderColor, arr);
    }

    @Override
    public double calculateArea(double[] arr) {
        return Math.round(Math.PI * arr[0] * arr[0]);
    }

    @Override
    public double calculatePerimeter(double[] arr) {
        return Math.round(2 * Math.PI * arr[0]);
    }
}
