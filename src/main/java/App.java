import java.util.Scanner;

/**
 * Существует ли пара?
 */
public class App {

  public static void main(String[] args) {

    int[] nums = getNums(5);

    boolean eq = true;

    for (int i = nums.length - 1; i > 0; i--)
      if (nums[i] != nums[i - 1])
        eq = false;

    if (eq) {

      for (int i : nums)
        System.out.print(i + " ");

    } else {

      for (int i = nums.length - 1; i >= 0; i--)
        for (int j = i - 1; j >= 0; j--)
          if (nums[i] == nums[j]) {
            System.out.println(nums[i] + " " + nums[j]);
            return;
          }
    }
  }

  // тут просто получаем 3 чила с консоли
  private static int[] getNums(int col) {

    int[] n = new int[col];

    Scanner sc = new Scanner(System.in);

    while (col-- > 0) {
      n[col] = sc.nextInt();
    }

    return n;
  }
}