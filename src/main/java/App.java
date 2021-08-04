import java.util.Scanner;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    StringBuilder str = new StringBuilder();

    str.append((num < 0) ? "отрицательное" : "положительное");
    str.append((num % 2 == 0) ? " четное" : " нечетное");

    System.out.println(num != 0 ? str + " число" : "ноль");
  }
}