import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    int[] nums = getNums(3);

    int size = nums.length;

    for (int i = 0; i < size; i++) {
      for (int j = i; j < size; j++) {
        if (nums[i] < nums[j]) {
          int tmp = nums[i];
          nums[i] = nums[j];
          nums[j] = tmp;
        }
      }
    }

    for (int i : nums) {
      System.out.print(i + " ");
    }

  }

  private static int[] getNums(int n) {

    int nums[] = new int[n];

    Scanner sc = new Scanner(System.in);

    int i = 0;
    while (i < n)
      nums[i++] = sc.nextInt();

    return nums;
  }
}