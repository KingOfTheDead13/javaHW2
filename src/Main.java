public class Main {
    public static void main(String[] args) {
        int initialBalance = 4000;
        int bonusMile = 250;

        int bonus = 0;
        if (bonusMile > 200) {
            bonus = bonusMile / 20;
        }
        int balanceFinale = initialBalance + bonusMile + bonus;

        System.out.println("У вас: " + balanceFinale);
        System.out.println("Начисленно бонусов: " + bonus);
    }
}