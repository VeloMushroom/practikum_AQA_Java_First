package service;
import model.*;
import model.Food;
public class ShoppingCart{
    private final Food[] cart;


    public ShoppingCart(Food[] cart) {
            this.cart = cart;
        }

    public double totalCartPrice() {
        double totalSum = 0;

        for (int i = 0; i < cart.length; i++){
            totalSum += cart[i].getSumPrice();
        }
        return totalSum;
    }
    public double disCountPrice() {
        double discountSum = 0;

        for (int i = 0; i < cart.length; i++){
            double discount = (100 - cart[i].getDiscount()) / 100;
            discountSum += cart[i].getSumPrice() * discount;
        }
        return discountSum;
    }

    public double vegetarianPrice() {
        double vegetarianSum = 0;

        for (int i = 0; i < cart.length; i++){
            if (cart[i].isVegetarian()){
                vegetarianSum += cart[i].getSumPrice();
            }
        }
        return vegetarianSum;
    }
}