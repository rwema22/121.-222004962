public class w2 {
   public static void main(String[] args) {
      System.out.println("Displaying a right triangle of *: ");

      for (int i = 1; i <= 6; i++) {

         for (int j = 1; j <= i; j++) {
            System.out.print(j + " ");
         }
         System.out.println(" ");
      }
   }
}
