public class MyArraySizeException extends ArrayIndexOutOfBoundsException  {

    public MyArraySizeException() {
        super("Размер матрицы должен быть 4х4");
    }
}
