public class Main {
    public static void main(String[] args) {

        int customerAccount = 100; //На счету у клиента
        int uploadVolume = 1500; //Внесённая сумма
        int bonus;

        if (uploadVolume >= 1000) {
            bonus = uploadVolume / 100; // По рублю за каждые 100 руб
        } else {
            bonus = 0;
        }

        int resultAccount = customerAccount + uploadVolume + bonus;

        System.out.println("Вы пополнили счёт на " + uploadVolume + " руб");
        System.out.println("Ваш бонус составил " + bonus + " руб");
        System.out.println("Ваш баланс " + resultAccount + " руб");

    }
}