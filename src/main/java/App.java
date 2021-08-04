import java.util.Scanner;

/**
 * Три числа
 */
public class App {

  public static void main(String[] args) {

    int[] nums = getNums(3);

    int idx = (nums[0] == nums[2]) ? 2 : 
              (nums[0] == nums[1]) ? 3 : 
              (nums[1] == nums[2]) ? 1 : 0;

    if (idx == 0) {
      return;
    }

    System.out.println(idx);
  }

  private static int[] getNums(int col) {

    int[] n = new int[col];

    Scanner sc = new Scanner(System.in);

    int i = 0;
    while (i < col) {
      n[i++] = sc.nextInt();
    }
    return n;
  }
}