import Products.AvailableProducts;
import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Print {

    // печать доступных продуктов на складе
    public void printAvailableProducts(int number) {
        AvailableProducts stockProducts = new AvailableProducts();
        List<Product> products = new ArrayList<>();
        switch (number) {
            case 1:
                products.addAll(stockProducts.getListDairyProducts());
                break;
            case 2:
                products.addAll(stockProducts.getListBreadAndPastries());
                break;
            case 3:
                products.addAll(stockProducts.getListVegetables());
                break;
            case 4:
                products.addAll(stockProducts.getListConfection());
                break;
        }

        printList(products);
        System.out.println();
    }

    // печать любого списка
    public void printList(List<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, products.get(i));
        }
    }

    // печать действий
    public void printActionAll(String section) {
        switch (section) {
            case "category":
                System.out.println(
                        "Выберете категорию продуктов:\n" +
                                "1. Молочные продукты\n" +
                                "2. Хлеб и выпечка\n" +
                                "3. Овощи\n" +
                                "4. Сладости\n"
                );
                break;
            case "add":
                System.out.println(
                        "Добавить в корзину(укажите номер продукта): \n" +
                                "9. Перейти в корзину\n" +
                                "0. Назад\n"
                );
                break;
        }
    }
}