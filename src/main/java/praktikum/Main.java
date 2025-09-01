package praktikum;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        var meat = new Meat(5, 100);
        var appleRed = new Apple(10, 50, Colour.RED);
        var appleGreen = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, appleRed, appleGreen};
        var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров в корзине без скидки - " + cart.productsWithoutDiscount());
        System.out.println("Общая сумма товаров в корзине со скидкой - " + cart.discountedProducts());
        System.out.println("Сумма всех вегетарианских продуктов без скидки " + cart.veganProductsWithoutDiscount());
    }
}