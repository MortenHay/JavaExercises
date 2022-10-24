package Uge5;

public class Finder {

   public static void main(String[] args) {
      System.out.println(find(11231, 0, 13));

   }

   public static String find(int k, int n, int b) {
      if (k < 0 || n < 0 || b < 1)
         return "Error";

      int z = n;
      int i = 0;
      while (z % b != 0) {
         z += k + (++i - 1);
         if (z < 0)
            return "Overflow";
      }

      return Integer.toString(z);
   }
}
