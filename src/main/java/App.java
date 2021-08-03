import java.util.Scanner;

/**
 * App
 */
public class App {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String name = sc.next();
    int age = sc.nextInt();

    if (age < 18) {
      System.out.println("Подрасти еще");
    }

  }
}