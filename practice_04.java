
//import java.util.Scanner;

/*public class practice_4 {
    public static void main(String[] args) {
        //question 1
        int a = 10;
        //if(a=11);
        System.out.println();
        //this show an error because of in if condition value is assinging

        //question 2
        byte s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in math");
        s1=sc.nextByte();
        System.out.println("enter your marks in physics");
        s2=sc.nextByte();
        System.out.println("enter your marks in chemistry");
        s3=sc.nextByte();
        float avg = (s1+s2+s3)/3.0f;
        if(avg>40 && s1>33 && s2>33 && s3>33 ) {
            System.out.println("you r passed");
        }
        else{
            System.out.println("u r failed");
        }*/
        //question 3
        import java.util.Scanner;

public class Practice_04{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income in lakhs:");
        
        float tax = 0;
        float income = sc.nextFloat();
        
        // Tax calculation based on income brackets
        if (income <= 2.5f) {
            tax = 0; // No tax for income up to 2.5 lakhs
        } else if (income <= 5f) {
            tax = 0.05f * (income - 2.5f); // 5% tax on income between 2.5 and 5 lakhs
        } else if (income <= 10f) {
            tax = 0.05f * (5.0f - 2.5f) + 0.1f * (income - 5f); // 5% tax on income between 2.5 and 5 lakhs, and 10% on income between 5 and 10 lakhs
        } else {
            tax = 0.05f * (5.0f - 2.5f) + 0.1f * (10f - 5f) + 0.2f * (income - 10f); // 5% tax on income between 2.5 and 5 lakhs, 10% on income between 5 and 10 lakhs, and 20% on income above 10 lakhs
        }
        
        // Display the tax amount
        System.out.println("Calculated tax: " + tax + " lakhs");
        
        sc.close(); // Close the scanner
    }
}
