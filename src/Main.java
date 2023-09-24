public class Main {
    public static void main(String[] args) {
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестная операционная система");
        }



        int osClient = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015) {
            if (osClient == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (osClient == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Неизвестная операционная система");
            }
        } else {
            if (osClient == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (osClient == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Неизвестная операционная система");
            }
        }



        int year = 2222;
        if (year < 1584) {
            System.out.println("Год должен быть больше 1584");
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }



        int deliveryDistance = 22;
        int deliveryDays;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
            System.out.println("Доставка невозможна");
        }
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        }



        int numberMonth = 11;
        String season;
        switch (numberMonth) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                System.out.println("Ошибка: номер месяца должен быть от 1 до 12");
                return;
        }
        System.out.println("Месяц " + numberMonth + " это " + season);
    }
}