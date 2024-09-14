
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){

    
    Scanner Sc = new Scanner(System.in);
    System.out.println("enter a year");

    int year = Sc.nextInt();

    if (year%4==0){
        System.out.println(year + "is a leap year");
    }
    
    else{
        System.out.println("not a leap year");
    }
}

}
