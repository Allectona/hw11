import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void leapYearCheck(int number) {
        if (number % 4 != 0) {
            System.out.println(number + " год - невисокосный год!");
        } else if (number % 100 == 0 && number % 400 != 0) {
            System.out.println(number + " год - невисокосный год!");
        } else {
            System.out.println(number + " год - високосный год!");
        }

    }

    public static void mobileAppVersion (int operationSystem, int yearOfManufactureOfThePhone){
        int currentYear = LocalDate.now().getYear();

        if (operationSystem == 0 && yearOfManufactureOfThePhone == currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (operationSystem == 0 && yearOfManufactureOfThePhone < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && yearOfManufactureOfThePhone == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (operationSystem == 1 && yearOfManufactureOfThePhone < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("У вас неизвестная операционная система. У нас нет для вас подходящего приложения");
        }

    }

    public static void daysCalculation(int distance) {
        int deliveryDays = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (distance > 20 && distance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays+1));
        } else if (distance > 60 && distance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays+2));
        }else {
            System.out.println("Извините, в данном районе доставка не осуществляется. Заберите вашу карту в отделении банка.");
        }

    }

    public static void task1() {
        int year = 2028;
        leapYearCheck(year);
    }

    public static void task2() {
        int clientOS = 0;
        int clientDeviceYear = 2023;
        mobileAppVersion(clientOS, clientDeviceYear);
    }

    public static void task3() {
        int deliveryDistance = 95;
        daysCalculation(deliveryDistance);
    }
}

