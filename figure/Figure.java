package figure;

public abstract class Figure implements Perimetr, Area {
    private String backgroundColor;
    private String borderColor;
    private double[] param;

    public Figure(String backgroundColor, String borderColor, double[] param) {
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.param = param;
    }

    public double[] getParam() {
        return param;
    }

    public double calculateArea() {
        return calculateArea(getParam());
    }

    public double calculatePerimeter() {
        return calculatePerimeter(getParam());
    }

    public void displayFigure() {
        System.out.printf("Периметр: %s, площадь: %s, цвет фона: %s, цвет границ: %s\n", calculatePerimeter(), calculateArea(), backgroundColor, borderColor);
    }
}
