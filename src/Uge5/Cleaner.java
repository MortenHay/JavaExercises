package Uge5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cleaner {

   public static void main(String[] args) throws FileNotFoundException {
      cleanText("src\\Uge5\\limerick.txt");
   }

   public static void cleanText(String filename) throws FileNotFoundException {
      Scanner input = new Scanner(new File(filename));
      while (input.hasNext()) {
         Scanner sc = new Scanner(input.nextLine());
         if (!sc.hasNext()) {
            System.out.println();
            continue;
         }
         String s = fixToken(sc.next());
         String st = "";

         while (st.isEmpty()) {
            if (!s.isEmpty())
               st += s;
            else {
               s = fixToken(sc.next());
            }
         }

         while (sc.hasNext()) {
            s = fixToken(sc.next());
            if (!s.isEmpty()) {
               st += " " + s;
            }
         }
         System.out.println(st);
      }
   }

   public static String fixToken(String s) {
      s = s.replace("'", "");
      s = s.replace(".", "");
      s = s.replace(",", "");
      s = s.replace("-", "");
      s = s.replace("?", "");
      s = s.replace("!", "");
      s = s.replace(";", "");
      s = s.replace("\"", "");
      s = s.replace(":", "");
      s = s.replace("(", "");
      s = s.replace(")", "");

      if (s.length() == 4)
         return "";

      return s;
   }
}
