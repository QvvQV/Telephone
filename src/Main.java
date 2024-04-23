public class Main {
    public static void main(String[] args) {

        int CustomerAccount = 100; //На счету у клиента
        int UploadVolume = 1500; //Внесённая сумма
        int bonus;

        if (UploadVolume >= 1000) {
            bonus = UploadVolume / 100; // По рублю за каждые 100 руб
        } else {
            bonus = 0;
        }

        int ResultAccount = CustomerAccount + UploadVolume + bonus;

        System.out.println("Вы пополнили счёт на " + UploadVolume + " руб");
        System.out.println("Ваш бонус составил " + bonus + " руб");
        System.out.println("Ваш баланс " + ResultAccount + " руб");

    }
}