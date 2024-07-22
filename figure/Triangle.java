package figure;

public class Triangle extends Figure implements Area, Perimetr{
    public Triangle(String backgroundColor, String borderColor, double[] arr) {
        super(backgroundColor, borderColor, arr);
    }

    @Override
    public double calculateArea(double[] arr) {
        double s = calculatePerimeter() / 2;
        return Math.round(Math.sqrt(s * (s - arr[0]) * (s - arr[1]) * (s - arr[2])));
    }
}
