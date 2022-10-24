package Uge4;

public class GradeConverter {
   public static int convert13to7(int grade) {
      int result = 0;
      switch (grade) {
         case 13:
            result = 12;
            break;
         case 11:
            result = 12;
            break;
         case 10:
            result = 10;
            break;
         case 9:
            result = 7;
            break;
         case 8:
            result = 7;
            break;
         case 7:
            result = 4;
            break;
         case 6:
            result = 02;
            break;
         case 5:
            result = 00;
            break;
         case 03:
            result = 00;
            break;
         case 00:
            result = -3;
            break;
         default:
            throw new IllegalArgumentException();
      }
      return result;
   }
}
