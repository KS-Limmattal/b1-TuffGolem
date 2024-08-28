public class Arrays {  // renamed damit intelliJ nicht motzt.
    static double[] sort(double[] arrayToSort){
        while (true){
            boolean sortedOnce = false;
            for (int index = 0; index < arrayToSort.length - 1; index++){
                if (arrayToSort[index] > arrayToSort[index + 1]){
                    double itemToChange = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = itemToChange;
                    sortedOnce = true;
                }
            }
            if (!sortedOnce){
                return arrayToSort;
            }
        }
    }

    static boolean isMagicSquare(int[][] square){
        int total = 0;
        int size = square[0].length;
        int[] rowTotals = new int[size];
        int[] diagonalTotals = {0, 0};
        for (int i = 0; i < size; i++){
            int thisTotal = 0;
            for (int j = 0; j < size; j++){
                int numba = square[i][j];
                thisTotal += numba;
                rowTotals[j] += numba;
                if (i == j){
                    diagonalTotals[0] += numba;
                }
                if (i == (size - 1) - j){
                    diagonalTotals[1] += numba;
                }

            }
            if (total == 0){
                total = thisTotal;
            }
            else if (thisTotal != total){
                return false;
            }
        }
        for (int thisTotal: rowTotals){
            if (thisTotal != total) {
                return false;
            }
        }
        for (int thisTotal: diagonalTotals){
            if (thisTotal != total) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO: Schreibe mehr Testcode
        System.out.println();
        double[] array1 = {1.2, 321.3, 432.2, 2.3, 2, 5, 3, 4, 6, 2, 3};
        double[] sorted_array1 = sort(array1);
        System.out.println(java.util.Arrays.toString(sorted_array1));
        // Test-Code für Teilaufgabe (f)
        System.out.println("Aufgabe f)");
        int[][] magicSquare = new int[][] { { 12, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(magicSquare));
        int[][] nonMagicSquare = new int[][] { { 1, 6, 15, 1 },
                { 13, 3, 10, 8 },
                { 2, 16, 5, 11 },
                { 7, 9, 4, 14 }
        };
        System.out.println(isMagicSquare(nonMagicSquare));
        System.out.println();
    }
}