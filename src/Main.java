public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int [] integersArr=new int [3];
        integersArr [0]=1;
        integersArr [1]=2;
        integersArr [2]=3;

        double [] doubleArr= {1.57, 7.654, 9.986};

        int [] intsArr= {1, 7, 9};

        //Задание 2
        System.out.println("\nЗадание 2");

        int oneInteger;
        for (oneInteger = 0; oneInteger < 3; oneInteger++) {
            if (oneInteger<2){
                System.out.print(integersArr[oneInteger]+  ", ");
            }else{
                System.out.println(integersArr[oneInteger]);
            }
        }

        double oneDouble;
        for (oneDouble = 0; oneDouble < 3; oneDouble++) {
            if (oneDouble<2){
            System.out.print(doubleArr[(int) oneDouble]+  ", ");
            }else {
                System.out.println(doubleArr[(int) oneDouble]);
            }
        }

        int oneInts;
        for (oneInts = 0; oneInts < 3; oneInts++) {
            if (oneInts<2){
                System.out.print(intsArr[oneInts]+  ", ");
            }else {
                System.out.println(intsArr[oneInts]);
            }
        }


        //Задание 3
        System.out.println("\nЗадание 3");

        for (oneInteger=2; oneInteger >= 0; oneInteger--) {
            if (oneInteger>0){
                System.out.print(integersArr[oneInteger]+  ", ");
            }else{
                System.out.println(integersArr[oneInteger]);
            }
        }

        for (oneDouble=2; oneDouble >= 0; oneDouble--) {
            if (oneDouble>0){
                System.out.print(doubleArr[(int) oneDouble]+  ", ");
            }else{
                System.out.println(doubleArr[(int) oneDouble]);
            }
        }

        for (oneInts=2; oneInts >= 0; oneInts--) {
            if (oneInts>0){
                System.out.print(intsArr[oneInts]+  ", ");
            }else{
                System.out.println(intsArr[oneInts]);
            }
        }

        //Задание 4
        System.out.println("\nЗадание 4");

        int number=0;
        for (; number<3; number++) {
            if(integersArr[number]%2!=0) {
                integersArr[number]++;
                System.out.print(integersArr[number]+ " ");
            }
            else {
                System.out.print(integersArr[number]+" ");
            }
        }
    }
}