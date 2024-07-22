public class MyArrayDataException extends RuntimeException{
    MyArrayDataException(int row, int col) {
        super("Эту ячейку невозможно преобразовать в число: " + row + "." + col);
    }
}
