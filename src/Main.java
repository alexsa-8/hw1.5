public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int [] integersArr=new int [3];
        integersArr [0]=1;
        integersArr [1]=2;
        integersArr [2]=3;

        double [] doubleArr= {1.57, 7.654, 9.986};

        char [] charsArr= {'1', '7', '9'};

        //Задание 2
        System.out.println("\nЗадание 2");
        int oneInteger;
        for (oneInteger = 0; oneInteger < 2; oneInteger++) {
            System.out.print(integersArr[oneInteger]+  ", ");
        }
        System.out.println(integersArr[2]);

        double oneDouble;
        for (oneDouble = 0; oneDouble < 2; oneDouble++) {
            System.out.print(doubleArr[(int) oneDouble]+  ", ");
        }
        System.out.println( doubleArr[2]);

        char oneChar;
        for (oneChar = 0; oneChar < 2; oneChar++) {
            System.out.print(charsArr[oneChar]+  ", ");
        }
        System.out.println(charsArr[2]);

        //Задание 3
        System.out.println("\nЗадание 3");
        for (oneInteger = 2; oneInteger > 0; oneInteger--) {
            System.out.print(integersArr[oneInteger]+  ", ");
        }
        System.out.println(integersArr[0]);

        for (oneDouble = 2; oneDouble > 0; oneDouble--) {
            System.out.print(doubleArr[(int) oneDouble]+  ", ");
        }
        System.out.println( doubleArr[0]);

        for (oneChar = 2; oneChar > 0; oneChar--) {
            System.out.print(charsArr[oneChar]+  ", ");
        }
        System.out.println(charsArr[0]);

        //Задание 4
        System.out.println("\nЗадание 4");
        int evenNumber=0;
        for (; evenNumber<3; evenNumber++) {
            if(integersArr[evenNumber]%2!=0) {
                integersArr[evenNumber]++;
                System.out.print(integersArr[evenNumber]+ " ");
            }

            else {
                System.out.print(integersArr[evenNumber]+" ");
            }
        }
    }
}