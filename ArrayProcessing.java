public class ArrayProcessing {
    public static void processArray(String[][] arr) {
        try {
            System.out.println(sumArr(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int sumArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException("Неверный размер массива! Ожидается 4x4.");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Неверный размер строки массива в строке " + i + ". Ожидается 4 элемента.");
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].matches("-?\\d+")) {
                    throw new MyArrayDataException("Эту ячейку невозможно преобразовать в число: [" + i + "][" + j + "]: " + arr[i][j], i, j);
                } else {
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return sum;
    }

}
