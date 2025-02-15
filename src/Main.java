public class Main {
    public static void main(String[] args) {

        String[][] matrix = {
                {"1", "2", "3", "2"},
                {"5", "6", "5", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "12"}
        };

        try {
            handlingExceptionArray(matrix);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println("Произошла ошибка: " + ex.getMessage());
        }
    }

    public static void handlingExceptionArray(String[][] matrix) throws MyArrayDataException, MyArraySizeException {

        int sum = 0;
        int rowIndex = 0;
        int colIndex = 0;
        String cell = "";

        if (matrix.length != 4) {
            throw new MyArraySizeException();
        }
        for (String[] row : matrix) {
            if (row.length != 4) {
                throw new MyArraySizeException();
            }
        }

        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    cell = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                    sum += Integer.parseInt(matrix[i][j]);
                }
            }
            System.out.println("Сумма матрицы = " + sum);

        } catch (NumberFormatException ex) {
            throw new MyArrayDataException(String.format("Нечисловое значение в ячейке [%d][%d] = %s", rowIndex, colIndex, cell));
        }

    }

}