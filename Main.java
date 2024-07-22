
public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrSize = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2", "4"}};
        String[][] arrStr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "one", "2"}};
        String[][] arrChar = {{"1", "2", "%", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        try {
            System.out.println(sumArr(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArr(arrSize));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArr(arrStr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sumArr(arrChar));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }


    public static int sumArr(String[][] arr) {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException();
                }
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}