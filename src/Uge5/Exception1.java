package Uge5;

public class Exception1 {
   public static void main(String[] args) {
      try {
         System.out.println(getCharAt("DTU-compute", -1));
      } catch (Exception e) {
         System.out.println("ERROR");
      }

      try {
         System.out.println(getCharAt("DTU-compute", 6));
      } catch (Exception e) {
         System.out.println("ERROR");
      }

      try {
         System.out.println(getCharAt("DTU-compute", 12));
      } catch (Exception e) {
         System.out.println("ERROR");
      }
   }

   public static char getCharAt(String text, int k) {
      return text.charAt(k);
   }

}
