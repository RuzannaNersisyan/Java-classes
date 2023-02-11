import java.util.Random;

public class Test {
    public static void arrayOdd(int[] arr) {
       int[] expArr = new int[arr.length];
       int lastElem = arr.length - 1;
       int firstElem = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                expArr[firstElem] = j;
                firstElem++;
            } else {
                expArr[lastElem] = j;
                lastElem--;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(expArr[i] + "  ");
        }
    }

    public static void binaryToDecimal(int[] arr) {
        long resultNum = 0;
        for (int j : arr) {
            if (j != 0 & j != 1) {
                System.out.println("Your entered array dosen\\'t binary!!");
                return;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length - i - 1] != 0) {
                resultNum += Math.pow(2, i);
            }
        }
        System.out.println("Result decimal number is : " + resultNum);
    }

    public static void mainDiagonal(int[][] matrix) {
        for (int[] i : matrix) {
            for (int j : i) {
                if (matrix.length != i.length) {
                    System.out.println("Tne entered matrix is non-square!!");
                    return;
                }
                System.out.print(j + "  ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j) {
                    System.out.print(matrix[i][j] + "   ");
                }else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

    public static void reverseMatrix(int[][] matrix) {
        int temp = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                if (matrix.length != row.length) {
                    System.out.println("Tne entered matrix is non-square!!");
                    return;
                }
                System.out.print(col + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row < col) {
                    temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp;
                }
                System.out.print(matrix[row][col] + "  ");
            }
            System.out.println();
        }
    }

    public static void evenOrOdd(int[][] matrix) {
        boolean even = true;
        int temp = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                if (matrix.length != row.length) {
                    System.out.println("Tne entered matrix is non-square!!");
                    return;
                }
                System.out.print(col + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                temp += matrix[row][col];
            }
            if (temp % 2 != 0) {
                even = false;
            }
        }
        if (even) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        int size = 20;
        int[] randomArray = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(300-50+1) + 50;
        }
        arrayOdd(randomArray);

        binaryToDecimal(new int[]{1, 1, 0, 0, 1, 1});

        mainDiagonal(new int[][] {{4, 5, 6}, {1, 2, 3}, {7, 8, 9}});

        reverseMatrix(new int[][] {{4, 5, 6}, {1, 2, 3}, {7, 8, 9}});

        evenOrOdd(new int[][] {{4, 5, 6}, {1, 2, 3}, {7, 8, 9}});

    }
}













