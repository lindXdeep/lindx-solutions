import java.util.Scanner;
/**
 * Минимум двух чисел
 */
public class App {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println((a > b) ? b : a);
  }
}