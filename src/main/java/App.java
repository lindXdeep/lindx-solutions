import java.util.Scanner;

/**
 * App
 */
public class App {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String str1 = sc.next();
    String str2 = sc.next();
    String result;

    if (str1.equals(str2)) {
      result = "Имена идентичны";
    } else if (str1.length() == str2.length()) {
      result = "Длины имен равны";
    } else {
      return;
    }

    System.out.println(result);
  }
}