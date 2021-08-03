import java.util.Scanner;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(
      (a > 0 & b > 0) ? 1 :
      (a<0 & b> 0)? 2 :
      (a < 0 & b < 0) ? 3 : 4
    );
  }
}