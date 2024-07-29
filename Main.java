
public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrSize = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrSize1 = {{"1", "2", "3", "4"}, {"4", "5", "6", "7", "8"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};
        String[][] arrStr = {{"1", "2", "3", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "one", "2"}};
        String[][] arrSymbol = {{"1", "2", "%", "4"}, {"4", "5", "6", "7"},
                {"7", "8", "9", "10"}, {"7", "4", "1", "2"}};

        ArrayProcessing.processArray(arr);
        ArrayProcessing.processArray(arrSize);
        ArrayProcessing.processArray(arrSize1);
        ArrayProcessing.processArray(arrStr);
        ArrayProcessing.processArray(arrSymbol);
    }
}

