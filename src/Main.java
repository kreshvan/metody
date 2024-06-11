public class Main {
    //задание 1
    public static void checkLeapYear(int number) {
        if (number > 1584 && number % 4 == 0 && number % 100 != 0 || (number > 1584 && number % 400 == 0)) {
            System.out.println(number + " "+"год-високосный год.");
        } else {
            System.out.println(number + " "+"год-не високосный.");
        }
    }
    //заданиеее 2.
    public static void suggestAppVersion (int phones, int year) {
        if (phones == 1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (phones == 1 && year > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((phones == 0 && year > 2015)) {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        } else if (phones == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
// задание 3
    public static int distanceTime(int km) {
        int day = 0;
        if (km <= 20) {
            day = day + 1;
            return day;
        } else if (km > 20 && km < 60) {
            day = day + 2;
            return day;
        } else if (km >= 60 && km < 100) {
            day = day + 3;
            return day;
        } else {
            return day;
        }
    }
    public static void main(String[] args) {
        int deliveryDistance = 60;
        int days = distanceTime(deliveryDistance);//применяем метод "distanceTime" с его свойствами к заданному киллометражу
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }
    }
}










