import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String str = "Orange, Banana, Apple ";
        int a = 0;
        int b = 8;
        int c = -22;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("_________Task 1_________");
        printThreeWords(str);

        System.out.println("_________Task 2_________");
        checkSumSign();

        System.out.println("_________Task 3_________");
        printColor();

        System.out.println("_________Task 4_________");
        System.out.println(compareNumbers(a, b));

        System.out.println("_________Task 5_________");
        System.out.println(isSumWithinRange(a, b));

        System.out.println("_________Task 6_________");
        System.out.println(printNumberType(a));

        System.out.println("_________Task 7_________");
        System.out.println(isNegative(c));

        System.out.println("_________Task 8_________");
        printStringMultipleTimes(str, b);

        System.out.println("_________Task 9_________");
        System.out.println(isLeapYear(2000));

        System.out.println("_________Task 10_________");
        System.out.println(Arrays.toString(invertArray(arr)));

        System.out.println("_________Task 11_________");
        System.out.println(Arrays.toString(fillArray()));

        System.out.println("_________Task 12_________");
        System.out.println(Arrays.toString(doubleIfLessThanSix(array)));

        System.out.println("_________Task 13_________");
        createAndFillArray();

        System.out.println("_________Task 14_________");
        System.out.println(Arrays.toString(initializeArray(b, c)));
    }

    static void printThreeWords(String str) {
        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s.trim());
        }
    }

    static void checkSumSign() {
        int a = -6;
        int b = 6;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else System.out.println("Сумма отрицательная");
    }

    static void printColor() {
        int value = 150;
        String color = value <= 0 ? "Красный" : value <= 100 ? "Желтый" : "Зеленый";

        System.out.println(color);
    }

    static String compareNumbers(int a, int b) {
        return a >= b ? "a >= b" : "a < b";
    }

    static boolean isSumWithinRange(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static String printNumberType(int a) {
        return a >= 0 ? "положительное" : "отрицательное";
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

    static void printStringMultipleTimes(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
//        System.out.println(str.repeat(a));
    }

    static boolean isLeapYear(int a) {
        return ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0));
    }

    static int[] invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else arr[i] = 0;
        }
        return arr;
    }

    static int[] fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }

    static int[] doubleIfLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    static void createAndFillArray() {
        int[][] arr = new int[6][6];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j == i) {
                    arr[i][j] = 1;
                }

                if (j == arr.length - i - 1) {
                    arr[i][j] = 1;
                }
            }
        }

        Arrays.stream(arr).forEach(array -> System.out.println(Arrays.toString(array)));
    }

    static int[] initializeArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}

