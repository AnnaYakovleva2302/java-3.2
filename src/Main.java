public class Main {
    public static void main(String[] args) {
        double start = 50.67;
        long amount = 1200;
        long bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
        }

        double total = start + amount + bonus;

        System.out.println("Total: " + total);
        System.out.println("Bonus: " + bonus);
    }
}
