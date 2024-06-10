public class Main {
    //задание 1
    public static void checkLeapYear(int number) {
        if (number > 1584 && number % 4 == 0 && number % 100 != 0 || (number > 1584 && number % 400 == 0)) {
            System.out.println(number + " "+"год-високосный год.");
        } else {
            System.out.println(number + " "+"год-не високосный.");
        }
    }
    //задание 2
    public static void suggestAppVersion (int phones, int year) {
        if (phones == 1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (phones == 1 && year > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (phones == 0 && year > 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (phones == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    //задание 3
    public static void distanceTime(int km) {
        if (km <= 20) {
            System.out.println("Потребуется дней:1" + " " + "срок доставки.");
        } else if (km > 20 && km < 60) {
            System.out.println("Потребуется дней:2" + " " + "срок доставки.");
        } else if (km >= 60 && km < 100) {
            System.out.println("Потребуется дней:3" + " " + "срок доставки.");
        } else if (km >= 100) {
            System.out.println("доставки нет.");
        }
    }
    public static void main(String[] args) {
        int year = 40001;
        checkLeapYear(year);
        int deliveryDistance = 50;
        distanceTime(deliveryDistance);
        int namePhone = 0;
        int clientDeviceYear = 2222;
        suggestAppVersion (namePhone,clientDeviceYear);
    }
}



