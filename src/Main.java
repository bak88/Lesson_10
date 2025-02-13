public class Main {
    public static void main(String[] args) {

        String[][] matrix = {
                {"1", "2", "3", "2"},
                {"5", "6", "5", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "12" }
        };

        handlingExceptionArray(matrix);
    }

    public static void handlingExceptionArray(String[][] matrix) {

        int sum = 0;
        int rowIndex = 0;
        int colIndex = 0;
        String cell = "";

        try {

            if (matrix.length != 4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            for (String[] row : matrix) {
                if (row.length != 4) {
                    throw new ArrayIndexOutOfBoundsException();
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    cell = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                    sum += Integer.parseInt(matrix[i][j]);
                }
            }
            System.out.println("Сумма матрицы = " + sum);

        } catch (ArrayIndexOutOfBoundsException ex) {
            throw new MyArraySizeException();

        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Нечисловое значение в ячейке [" + rowIndex + "][" + colIndex + "] = " + cell);
        }
    }

}