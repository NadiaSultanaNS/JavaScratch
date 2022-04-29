import java.util.Scanner;

public class FibonnaciSeries {
    public static void Fibonacci(int n){
        int num1 = 0, num2 = 1;
        int counter = 0;
        while(counter < n){
            System.out.println(num1 + " ");

            int num3 = num2+num1;
            num1 = num2;
            num2 = num3;
            counter = counter+1;
        }
    }

    public static boolean isPalindrome(String str){
        int i = 0, j = str.length()-1;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Fibonacci(10);
        System.out.println("Please Enter a String: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(isPalindrome(str));
    }

}
