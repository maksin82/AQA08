
public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrSize = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrStr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "one", "2"}};
        String[][] arrSymbol = {{"1", "2", "%", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};

        processArray(arr);
        processArray(arrSize);
        processArray(arrStr);
        processArray(arrSymbol);
    }


    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;

        if (arr.length != 4) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < arr[i].length; j++) {
                if (!(arr[i][j]).matches("-?\\d+")) {
                    throw new MyArrayDataException(i, j);
                } else {
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return sum;
    }


    public static void processArray(String[][] arr) {
        try {
            System.out.println(sumArr(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}

