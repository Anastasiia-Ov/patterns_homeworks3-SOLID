import Basket.Basket;
import Basket.Delivery;
import Products.AvailableProducts;
import Products.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AvailableProducts available = new AvailableProducts();
        Print pr = new Print();
        Basket basket = new Basket();
        Delivery del = new Delivery();
        Scanner scanner = new Scanner(new File("/Users/Java2/Шаблоны проектирования/1.3. Magics, DRY, SOLID/SOLID/src/console.txt"));

        // проверка доставки на адрес
        System.out.println("Введите адрес доставки: ");
        String address = scanner.nextLine();
        boolean delivery = del.isDelivery(address);
        while (delivery) {
            // выбор категории
            pr.printActionAll("category");
            int category = Integer.parseInt(scanner.nextLine());
            pr.printAvailableProducts(category);

            // добавление продуктов
            pr.printActionAll("add");
            int number = Integer.parseInt(scanner.nextLine());
            while (number != 9 && number != 0) {
                Product product = available.isCategory(category).get(number - 1);
                basket.addProduct(product);
                number = Integer.parseInt(scanner.nextLine());
            }
            if (number == 0) continue;

            // корзина
            if (number == 9) {
                if (!basket.isEmptyBasket()) {
                    pr.printList(basket.getProducts());
                    basket.calcAmountToBePaid(address);
                } else {
                    System.out.println("Корзина пуста");
                }
                break;
            }
        }
        scanner.close();
    }
}