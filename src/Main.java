public class Main {
    public static void main(String[] args) {
        System.out.println("\nTask 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nTask 2");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("\nTask 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        System.out.println("\nTask 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("\nTask 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        System.out.println("\nTask 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        System.out.println("\nTask 7");
        int a = 1;
        for (int i = 1; i < 10; i++) {
            System.out.println(a);
            a *= 2;
        }
        System.out.println("\nTask 8");
        int jar = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + jar;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " ");
        }
        System.out.println("\nTask 9");
        int savings = 29000;
        int bank = 1;
        for (int i = 1; i <= 12; i++) {
            bank = bank + bank / 120;
            bank = bank + savings;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + bank + " ");
        }
        System.out.println("\nTask 10");
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }

    }
}











