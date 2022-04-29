import sun.jvm.hotspot.oops.Instance;

public class Computer {

    private String name;
    private int year;
    private double cost;

    public Computer(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setCost(double cost){
        this.cost = cost;
    }

    public String getName(){
        return name;
    }
    public int year(){
        return year;
    }
    public  double cost(){
        return cost;
    }
    public static void computerInfo (String name, int year, double cost){
        System.out.println(name + year + cost);
    }
}
