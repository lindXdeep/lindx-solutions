<<<<<<< HEAD
=======
import java.util.Scanner;

>>>>>>> 001-Переходим_дорогу_вслепую
/**
 * App
 */
public class App {

  public static void main(String[] args) {
<<<<<<< HEAD
    System.out.println("init javarush");
=======

    System.out.println(check(getMinute()));

  }

  private static String check(float t) {
    if (t % 5f < 3f) {
      return "зелёный ";
    } else if (t % 5f >= 3f && t % 5f < 4f) {
      return "жёлтый";
    }
    return "красный";
  }

  private static float getMinute() {
    return new Scanner(System.in).nextFloat();
>>>>>>> 001-Переходим_дорогу_вслепую
  }
}