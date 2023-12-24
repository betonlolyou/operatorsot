public class Main {
    public static void main(String[] args) {
        int start = 100;
        int deposit = 1100;
        int bonus;
        int total;

        if (deposit >= 1100) {
            bonus = deposit / 100;
            total = (start + bonus + deposit);
            System.out.println("У вас на счету: " + total + " руб.");
            System.out.println("Было начислено бонусов: " + bonus + " руб.");
        } else {
            total = (start + deposit);
            System.out.println("У вас на счету: " + total + " руб.");
            System.out.println("Было начислено бонусов: 0 руб.");
        }
    }
}
