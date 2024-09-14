public class Array {
    public static void main(String[] args) {
       int [] marks ={98,78,45,67,56};
        //for(int i=0; i<marks.length; i++) {
         //   System.out.println(marks[i]);
        
        //quiz- print the array in reverse order 
         for(int i=marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
         }
    }
}
