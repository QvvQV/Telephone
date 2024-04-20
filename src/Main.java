public class Main {
  public static void main(String[] args) {

      int customer=100;
      int volume=1500;
      int bonus;

      if (volume >= 1000) {
          bonus = volume / 100;
      } else {
          bonus = 0;
      }

      int itog = customer + volume + bonus;

      System.out.println("Вы пополнили счёт на " + volume + " руб");
      System.out.println("Ваш бонус составил " + bonus + " руб");
      System.out.println("Ваш баланс " + itog + " руб");

  }
}