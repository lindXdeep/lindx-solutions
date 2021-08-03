import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    int[] nums = getNums(4);

    for (int i : nums)
      nums[0] = (i < nums[0]) ? i : nums[0];
    
    System.out.println(nums[0]);
  }

  private static int[] getNums(int n) {

    int nums[] = new int[n];

    Scanner sc = new Scanner(System.in);

    int i = 0;
    while (i > n)
      nums[i++] = sc.nextInt();

    return nums;
  }
}