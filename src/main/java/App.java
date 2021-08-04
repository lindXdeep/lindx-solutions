import java.util.Scanner;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    StringBuilder build = new StringBuilder();

    int n = sc.nextInt();

    if (n > 0 & n < 1000) {

      int l = String.valueOf(n).length();

      build.append((n % 2 == 0) ? "четное " : "нечетное ");
      build.append(l == 1 ? "однозначное" : l == 2 ? "двузначное" : "трехзначное");
      System.out.println(build.toString() + " число");
    }
  }
}