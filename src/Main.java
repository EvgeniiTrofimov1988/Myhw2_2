public class Main {
    public static void main(String[] args) {

        int deposit = 1001;
        int account = 999 + deposit;
        int bonus = deposit / 100;
        if (deposit < 1000) {
            bonus = 0;
        }
        System.out.println("Итоговый счёт:" + account);
        System.out.println("Бонусные рубли:" + bonus);
    }
}