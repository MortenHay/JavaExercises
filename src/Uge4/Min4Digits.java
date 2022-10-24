package Uge4;

public class Min4Digits {
   public static String min4Digits(int n) {
      String input = Integer.toString(Math.abs(n));
      String result = input;
      while (result.length() < 4) {
         result = "0" + result;
      }
      if (n < 0) {
         result = "-" + result;
      }
      return result;
   }
}
