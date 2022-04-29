package FlowChartChapter;

import java.util.Scanner;

public class primeNum {
    public static void primeNumber( int inputNum ){
        if ( inputNum <= 1){
            System.out.println( inputNum + " is not a prime Number." );
        }
        int c = 2;
        int x = 0;
        while ( c * c < inputNum ){
            if( inputNum % c == 0 ){
                x = 1;
            }
            c += 1;
        }
        if ( x == 1 ){
            System.out.println ( inputNum + " is not a prime Number." );
        }
        else {
            System.out.println(inputNum + " is a PRIME number.");
        }

    }

    public static void primeNum(int inputNum){
        int c = 2;
        int x = 0;
        while (c<inputNum){
            if (inputNum%c == 0){
                x = 1;
            }
            c += 1;
        }
        if ( x == 1 ){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ); //create a scanner object
        System.out.println("Please Enter a number to check it is prime or not: ");
        int inputNum = input.nextInt(); //read user input
        primeNumber(inputNum);
        primeNum(inputNum);
    }
}
