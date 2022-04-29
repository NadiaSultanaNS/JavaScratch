import java.util.Scanner;

public class ModifiedFibonacci {

    public static int fibonacciModified(int number) {
           if(number == 1 || number == 2){
               return 1;
           }
           int num1 = 1, num2 = 1, num3 = 1;
        for (int i = 3; i <= number ; i++) {
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;

    }

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Fibonacci Series: ");
        for (int i = 1; i < number; i++) {
            System.out.println(fibonacciModified(i)+" ");
        }
    }
}
