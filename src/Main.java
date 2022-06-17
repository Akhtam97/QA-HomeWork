import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Products soap = new Products("Мыло", "Dove", 3, 250);
    static Products drink = new Products("Напиток", "Coca-Cola", 5, 500);
    static Products shampoo = new Products("Шампунь", "Жумайсынба", 4, 300);
    static ArrayList<Products> stock1 = new ArrayList<>();
    static ArrayList<Integer> cm = new ArrayList<>();
    static int cm1All = 0;

    public static void main(String[] args) {

        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберитепунктменю");
            System.out.println("    1) Работа с товарами");
            System.out.println("    2) Работа со складом");
            System.out.println("    0) Выход  из программы");
            mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {//Метод для работы с товарами//
                workWithProducts();
            } else if (mainMenuItem == 2) {
                //Метод для работы со складами
                workWithStorages();
            } else if (mainMenuItem == 0) {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Выход из программы...");
                break;
            } else {
                System.out.println("-------------------------------------------------------------");
                System.out.println("Ошибка. Введите цифру из меню!!!");
            }
        }
    }

    private static void workWithProducts() {
        while (true) {
            int mainMenuItem;

            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе с товарами");
            System.out.println("    1) Добавление товара на склад");
            System.out.println("    2) Добавление группы товаров на склад");
            System.out.println("    3) Удаление товара со склада");
            System.out.println("    4) Удаление группы товаров со склада");
            System.out.println("    5) Показать типы товаров и их количество");
            System.out.println("    0) Выход в главное меню");
            mainMenuItem = sc.nextInt();
            //Код для дальнейшей работы
            if (mainMenuItem == 1) {
                boolean b = true;
                while (b) {
                    System.out.println("Коробку какого товара вы хотели бы добавить?");
                    System.out.println("1 - Напиток Кока-колу + 5 к.м.");
                    System.out.println("2 - Шампунь Жумайсынба + 3 к.м.");
                    System.out.println("3 - Мыло Dove + 4 к.м.");
                    System.out.println("0 - Для Выхода");
                    int answer = sc.nextInt();
                    if (answer == 1) {
                        stock1.add(drink);
                        cm.add(drink.getBoxVolume());
                    } else if (answer == 2) {
                        stock1.add(shampoo);
                        cm.add(shampoo.getBoxVolume());
                    } else if (answer == 3) {
                        stock1.add(soap);
                        cm.add(soap.getBoxVolume());
                    } else if (answer == 0) {
                        System.out.println("Вернемся");
                        return;
                    } else {
                        System.out.println("Ошибка");
                    }
                }
            }
        }
    }

    private static void workWithStorages() {
        while (true) {
            int mainMenuItem;
            System.out.println("-------------------------------------------------------------");
            System.out.println("Выберите пункт меню в работе со складами");
            System.out.println("    1) Показать список складов и товаров в них");
            System.out.println("    2) Добавть новый склад");
            System.out.println("    3) Удалить склад");
            System.out.println("    0) Выход в главное меню");
            mainMenuItem = sc.nextInt();
            if (mainMenuItem == 1) {
                boolean b = true;
                while (b) {
                    System.out.println("1 - Склад Россия");
                    System.out.println("2 - Склад Кыргызстан");
                    System.out.println("3 - Склад Путин!");
                    System.out.println("0 - Вернуться");
                    int answer = sc.nextInt();
                    if (answer == 1) {
                        for (Products all : stock1) {
                            System.out.println(all);
                        }
                    }
                    for (int i = 0; i < cm.size(); i++) {
                        cm1All = cm1All + cm.get(i);
                    }
                    System.out.println("Общий объем" + cm1All);
                }
            }
        }
    }
}
