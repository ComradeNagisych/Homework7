public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int total = 2459000;
        int deposit = 15000;
        int sum = 0;
        int month = 1;
        while (sum < total) {
            sum = sum + (sum / 100);
            sum = sum + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }

        System.out.println("Задача №2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println("Задача №3");
        int populationY = 12000000;
        int birthRatePerThousand = 17;
        int deathRatePerThousand = 8;
        int year = 1;
        while (year <= 10) {
            populationY = populationY + (birthRatePerThousand * populationY / 1000) - (deathRatePerThousand * populationY / 1000);
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
            year++;
        }

        System.out.println("Задача №4");
        int total2 = 12000000;
        int deposit2 = 15000;
        int sum2 = 0;
        int month2 = 1;
        while (sum2 < total2) {
            sum2 = sum2 + (sum2 / 100 * 7);
            sum2 = sum2 + deposit2;
            System.out.println("Месяц " + month2 + ", сумма накоплений равна " + sum2 + " рублей");
            month2++;
        }

        System.out.println("Задача №5");
        int total3 = 12000000;
        int deposit3 = 15000;
        int sum3 = 0;
        int month3 = 1;
        while (sum3 < total3) {
            sum3 = sum3 + (sum3 / 100 * 7);
            sum3 = sum3 + deposit3;
            if (month3 % 6 == 0) {
                System.out.println("Месяц " + month3 + ", сумма накоплений равна " + sum3 + " рублей");
            }
            month3++;
        }

        System.out.println("Задача №6");
        int deposit4 = 15000;
        int sum4 = 0;
        int month4 = 1;
        int totalMonths = 12 * 9;
        while (month4 <= totalMonths) {
            sum4 = sum4 + (sum4 / 100 * 7);
            sum4 = sum4 + deposit4;
            if (month4 % 6 == 0) {
                System.out.println("Месяц " + month4 + ", сумма накоплений равна " + sum4 + " рублей");
            }
            month4++;
        }

        System.out.println("Задача №7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        System.out.println("Задача №8");
        int period = 79;
        int thisYear = 2023;
        int before = thisYear - 200;
        int after = thisYear + 100;
        for (int year2 = 0; year2 < after; year2 += period) {
            if (year2 >= before) {
                System.out.println(year2);
            }
        }
    }
}