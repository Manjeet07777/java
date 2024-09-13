
import java.util.Scanner;

//question 1
public class practice_2 {
    public static void main(String[] args) {
        float a = 7/4f * 9/2f;
        System.out.println(a);
        //question 2
        char grade = 'a';
        grade = (char)(grade +8);
        System.out.println(grade);
        //decrypting the grade
        grade = (char)(grade -8);
        System.out.println(grade);

        //question 3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int e = sc.nextInt();
        System.out.println(a<5);
        //sc.close();

        //question 4
        float v = 1f;
        float u = 2f;
        float t = 3f;
        float s = 4f;
        float z = ((v*v) - (u*u)) / (2*t*s);
        System.out.println(z);
    }
}