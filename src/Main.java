import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner console = new Scanner(System.in);

    // Задача 1 Определение високосного года
    // Пишем метод для ввода проверямого года
    public static int enterYearValue() {
        System.out.println("Введите год, который хотите проверить");
        int year = console.nextInt();
        return year;
    }

    // Определяем високосный год или нет
    public static void leapYearDefinition(int year) {
        int year4 = year % 4;// Для определения года, кратного 4 (високосный)
        int year100 = year % 100;// Для определения года, кратного 100 (невисокосный)
        int year400 = year % 400;// Для определения года, кратного 400 (високосный)
        if ((year4 == 0 && year100 != 0) || (year400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    // Задача 2 Выбор версии приложения
    // Вводим год устройства
    public static int enterYearOfManufactureOfDevice() {
        System.out.println("Введите год производства устройства");
        int clientDeviceYear = console.nextInt();
        return clientDeviceYear;
    }

    // Вводим значение операционной системы
    public static int enterDeviceOperatingSystemValue() {
        System.out.println("Определите какая операционная система на вашем устройтсве. Если iOS, " +
                "то введите цифру 0, если Android, то введите цифру 1");
        int clientOS = console.nextInt();
        return clientOS;
    }
    // Определяем версию приложения
    public static void selectingApplicationVersion(int clientDeviceYear, int clientOS) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear < currentYear) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (clientDeviceYear >= currentYear) {
                if (clientOS == 0) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }

    // Задача 3 Расчет дней доставки банковской карты
    //Вводим расстоянме до клиента
    public static int deliveryDistance() {
        System.out.println("Введите величину расстояния доставки до вас в километрах");
        int deliveryDistance = console.nextInt();
        return deliveryDistance;
    }

    // Создаем метод для решения задачи
    public static void calculationOfDaysForDeliveryOfABankCard(int deliveryDistance) {
        int day20km = 1;// Количество дней доставки при расстоянии до 20 км
        int day60km = 2;// Количество дней доставки при расстоянии от 20 до 60 км
        int day100km = 3;// Количество дней доставки при расстоянии от 60 до 100 км
        if (deliveryDistance <= 20) {
            System.out.println("На доставку потребуется дней: " + day20km);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("На доставку потребуется дней: " + day60km);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("На доставку потребуется дней: " + day100km);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        // Решаем задачу 1 с помощью метода
        leapYearDefinition(enterYearValue());
        // Решаем задачу 2 с помощью метода
        selectingApplicationVersion(enterYearOfManufactureOfDevice(), enterDeviceOperatingSystemValue());
        // Решаем задачу 3 с помощью метода
        calculationOfDaysForDeliveryOfABankCard(deliveryDistance());
    }


}