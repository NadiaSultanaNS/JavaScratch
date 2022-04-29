public class hw1 {
    public static int cube(int i){
     return(i*i*i);
    }
    public static void main(String[] args) {
        int x = 0;
        for (int i = -10; i <10 ; i++) {
            x = cube(i);
            System.out.println(x);
        }
    }
}
