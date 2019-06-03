
import java.util.*; 

public class Part1 {

public static boolen isStringPermutation(String s1, String s2) {

     int first_string = s1.length();
     int second_string = s2.length();

      if (first_string != second_string) {
          return false;
      }
      return true;
}

public static void main (String[] args) {
    String s1 = "abc";
    String s2 = "ddd";

    if (isStringPermutation(s1, s2) == true) {
        System.out.println("True");

    }
    else {
        System.out.println("False");

    }
}
}
