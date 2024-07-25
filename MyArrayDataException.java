public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int col) {
        super("Эту ячейку невозможно преобразовать в число: " + row + "." + col);
    }
}
