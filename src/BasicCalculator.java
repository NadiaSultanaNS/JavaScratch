import java.util.Scanner;

public class BasicCalculator {
    public static void Add(int a, int b){
        int c = a+b;
        System.out.println("Add Result: "+ c);
    }
    public static void Substract(int a, int b){
        int c = a-b;
        System.out.println("Subtraction Result: "+ c);
    }
    public static void Multiply(int a, int b){
        int c = a*b;
        System.out.println("Multiplication Result: "+ c);
    }
    public static void Divide(int a, int b){
        int c = a/b;
        System.out.println("Division Result: "+ c);
    }

    public static void main(String[] args) {
        System.out.println("Please Enter Two Numbers: ");
        Scanner scan = new Scanner(System.in);
        int userNum1 = scan.nextInt();
        int userNum2 = scan.nextInt();
        System.out.println("please enter 1 to add, 2 to subtract, 3 to multiply, 4 to Divide and 5 to exit: ");
        String str = scan.next();
        switch (str){
            case "1":
                Add(userNum1, userNum2);
                break;
            case "2":
                Substract(userNum1,userNum2);
                break;
            case "3":
                Multiply(userNum1,userNum2);
                break;
            case "4":
                Divide(userNum1, userNum2);
                break;
            case "5":
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Entry, Try Again");
        }



    }
}
