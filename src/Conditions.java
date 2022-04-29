public class Conditions {
    public static void main(String[] args) {
        //1
        int score = 50;
        if(score>90){
            System.out.println('A');
        }
        if(score>80 && score<90){
            System.out.println('B');
        }
        if(score>70 && score < 80){
            System.out.println('C');
        }
        if (score> 55 && score < 70){
            System.out.println('D');
        }
        if(score < 55) {
            System.out.println('F');
        }

        //2
        int num = 2;
        switch (num){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
            }

            //3
        int number = 10;
        if(num%2 != 0){
            System.out.println("Cool");
        }
        if(num%2 ==0 && (num>=2 && num<=5)){
            System.out.println("Not Cool");
        }
        if(num%2 ==0 && (num>=6 && num<=20)){
            System.out.println("Cool");
        }
        if(num%2 ==0 && num>=20){
            System.out.println("Not Cool");
        }

        }
    }

