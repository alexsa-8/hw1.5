import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int[] integersArr = new int[3];
        integersArr[0] = 1;
        integersArr[1] = 2;
        integersArr[2] = 3;
        double[] doubleArr = {1.57, 7.654, 9.986};
        int[] intsArr = {1, 7, 9};
        //Задание 2
        System.out.println("\nЗадание 2");
        int oneInteger;
        for (oneInteger = 0; oneInteger < integersArr.length; oneInteger++) {
            if (oneInteger < 2) {
                System.out.print(integersArr[oneInteger] + ", ");
            } else {
                System.out.println(integersArr[oneInteger]);
            }
        }
        double oneDouble;
        for (oneDouble = 0; oneDouble < doubleArr.length; oneDouble++) {
            if (oneDouble < 2) {
                System.out.print(doubleArr[(int) oneDouble] + ", ");
            } else {
                System.out.println(doubleArr[(int) oneDouble]);
            }
        }
        int oneInts;
        for (oneInts = 0; oneInts < intsArr.length; oneInts++) {
            if (oneInts < 2) {
                System.out.print(intsArr[oneInts] + ", ");
            } else {
                System.out.println(intsArr[oneInts]);
            }
        }
        //Задание 3
        System.out.println("\nЗадание 3");
        for (oneInteger = 2; oneInteger >= 0; oneInteger--) {
            if (oneInteger > 0) {
                System.out.print(integersArr[oneInteger] + ", ");
            } else {
                System.out.println(integersArr[oneInteger]);
            }
        }
        for (oneDouble = 2; oneDouble >= 0; oneDouble--) {
            if (oneDouble > 0) {
                System.out.print(doubleArr[(int) oneDouble] + ", ");
            } else {
                System.out.println(doubleArr[(int) oneDouble]);
            }
        }
        for (oneInts = 2; oneInts >= 0; oneInts--) {
            if (oneInts > 0) {
                System.out.print(intsArr[oneInts] + ", ");
            } else {
                System.out.println(intsArr[oneInts]);
            }
        }
        //Задание 4
        System.out.println("\nЗадание 4");
        for (int number = 0; number < integersArr.length; number++) {
            if (integersArr[number] % 2 != 0) {
                integersArr[number]++;
                System.out.print(integersArr[number] + " ");
            } else {
                System.out.print(integersArr[number] + " ");
            }
        }
        //Задание 5
        System.out.println("\nЗадание 5");
        int size = 3;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - i - 1] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }

        //Задание 6
        System.out.println("\nЗадание 6");
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(arr));
        int[] additionalArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            additionalArr[arr.length - 1 - i] = arr[i];
        }
        arr = additionalArr;
        System.out.println(Arrays.toString(arr));

        //Задание 7
        System.out.println("\nЗадание 7");
        int n = arr.length;
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[n - i - 1];
            arr[n - i - 1] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));

        //Задание 8
        System.out.println("\nЗадание 8");
        int[] numbers = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int k = numbers.length;
        for (int m = 0; m <= k - 1; m++) {
            for (int p = 0; p < k - 1; p++) {
                if (numbers[m] + numbers[p + 1] == -2) {
                    System.out.print(numbers[m] + " ");
                    System.out.println(numbers[p + 1]);
                }
            }
        }
        //Задание 9
        System.out.println("\nЗадание 9");
        int r, two = -2;
        for (int m = 0; m < k; m++) {
            if (numbers[m] >= 0) {
                r = numbers[m]*(-1) + two;
                System.out.println(numbers[m] + " " + r);
            } else if (numbers[m] < 0) {
                r = numbers[m] * (-1) + two;
                System.out.println(numbers[m] + " " + r);
            }

        }
    }
}