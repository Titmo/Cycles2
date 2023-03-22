public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int contribution = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + contribution;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i =1;
        while (i <= 10) {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        for ( i = 10 ; i >= 1; i--) {
            System.out.print(i+" ");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача 3");
        int populationCountryY = 12_000_000;
        int mortalityPerThousand=17;
        int birthRatePerThousand=8;
        int mortality =(populationCountryY/1000)*birthRatePerThousand;
        int birthRate =(populationCountryY/1000)*mortalityPerThousand;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Год " + i + " численность населения составляет " + populationCountryY );
            populationCountryY = (populationCountryY-mortality)+birthRate;
            mortality =(populationCountryY/1000)*birthRatePerThousand;
            birthRate =(populationCountryY/1000)*mortalityPerThousand;
        }
    }
    public static void task4() {
        System.out.println("Задача 4");

    }

    public static void task5() {
        System.out.println("Задача 5");

    }

    public static void task6() {
        System.out.println("Задача 6");

    }

    public static void task7() {
        System.out.println("Задача 7");

    }

    public static void task8() {
        System.out.println("Задача 8");


    }
}