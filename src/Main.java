public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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


    public static void task1() {
        int year = 2028;
        leapYearCheck(year);
    }

    public static void task2() {

    }
}