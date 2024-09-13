
import java.util.Scanner;



public class first {
    public static void main(String[] args) {
        /*float subject1 =30;
        float subject2 = 40;
        float subject3 = 47;
        float cgpa = (subject1 + subject2 + subject3) /30;
        System.out.println(cgpa);
    }
} 
*/
       /* System.out.println("enter your name");
        Scanner sc =  new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("hi " +name+ " congrates!");

    }
}*/

       // System.out.println("enter a number");
       // Scanner sc = new Scanner(System.in);
        //System.out.println(sc.hasNextInt());
       // int a = 7;
        //int b = ++a * 8;
       // System.out.println(b);
       Scanner sc = new Scanner(System.in);
       System.out.println("enter physics marks");
       int physics = sc.nextInt();
       System.out.println("enter math marks");
       int math = sc.nextInt();
       System.out.println("enter chemistry marks");
       int chem = sc.nextInt();
       System.out.println("enter computer marks");
       int comp = sc.nextInt();
       System.out.println("enter hindi marks");
       int hindi = sc.nextInt();
       int totalmarks = (physics+chem+math+comp+hindi);
       float pr = (totalmarks/500.0f) *100;
       System.out.println("percentage  is :");
       System.out.println(pr);








    }

}
