package Basket;

import Products.Product;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final int MIN_SUM_ORDER = 300;          // мин.сумма заказа (только товары)
    private int discount;                           // скидка
    private int priceDelivery;                      // цена доставки
    private int sumCashback;                        // сумма кэшбэка
    private int sumProduct;                         // сумма только за товары
    private int amountToBePaid;                     // сумма к оплате
    private final List<Product> products = new ArrayList<>(); // список продуктов, добавленных в корзину

    // добавление продукта в корзину
    public void addProduct(Product product) {
        products.add(product);
    }

    // расчет итоговой суммы к оплате
    public void calcAmountToBePaid(String street) {
        calcCashbackAndProduct();
        calcDelivery(street);
        if (sumProduct >= MIN_SUM_ORDER) {
            if (applyDiscount()) {
                amountToBePaid = sumProduct + priceDelivery - discount;
                System.out.printf(
                        "Скидка %d₽ применена!\n" +
                                "Доставка: %d₽\n" +
                                "Итого к оплате: %d₽\n" +
                                "Ваш кэшбэк за покупку = %d\n",
                        discount, priceDelivery, amountToBePaid, sumCashback
                );
            } else {
                amountToBePaid = sumProduct + priceDelivery;
                System.out.printf(
                        "Доставка: %d₽\n" +
                                "Итого к оплате: %d₽\n" +
                                "Ваш кэшбэк за покупку =  %d\n",
                        priceDelivery, amountToBePaid, sumCashback
                );
            }
        } else {
            System.out.printf("Минимальная сумма заказа %d₽\n", MIN_SUM_ORDER);
        }
    }

    // расчет цены за товар и кэшбэк
    public void calcCashbackAndProduct() {
        for (Product product : products) {
            int price = product.getPrice();
            int cashback = product.getCashback();
            sumProduct += price;
            sumCashback += cashback;
        }
    }

    // расчет доставки
    public void calcDelivery(String street) {
        Delivery delivery = new Delivery();
        priceDelivery = delivery.calcDelivery(street);
    }

    // проверка на применение скидки
    public boolean applyDiscount() {
        if (new DiscountFrom2000().applyDiscount(sumProduct)) {
            discount = new DiscountFrom2000().getDISCOUNT();
            return true;
        } else if (new DiscountFrom1000().applyDiscount(sumProduct)) {
            discount = new DiscountFrom1000().getDISCOUNT();
            return true;
        }
        return false;
    }

    // пуста ли корзина
    public boolean isEmptyBasket() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
            return true;
        }
        return false;
    }

    public List<Product> getProducts() {
        return products;
    }
}