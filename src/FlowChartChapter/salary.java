package FlowChartChapter;

import java.util.Scanner;

public class salary {

    public static void salary(int salary){
        if(salary > 10000){
            //salary = salary + 2000;
            System.out.println("Yayy! Your bonus is 2000. Your total salary is: "+ (salary+2000));
        }
        else {
            //salary = salary + 1000;
            System.out.println("Yayy! Your bonus is 1000. Your total salary is: "+ (salary+1000));
        }
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please Enter Your Salary to Check if You are eligible for Bonus: ");
        int input = myObj.nextInt();
        salary(input);
    }
}
