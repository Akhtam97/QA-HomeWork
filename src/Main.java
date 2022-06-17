import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Product drink = new Product("Напиток", "Кока-Кола", 5,500);
        Product shampoo = new Product("Шампун", "Жумайсынба", 3,250);
        Product soap = new Product("Мыло","Хозяйственное",4,300);
        ArrayList<Stock> stocks = new ArrayList<>();
        Stock stock1 = new Stock();
        Stock stock2 = new Stock();
        Stock stock3 = new Stock();
        stocks.add(stock1);
        stocks.add(stock2);
        stocks.add(stock3);
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
        }
    }
}





