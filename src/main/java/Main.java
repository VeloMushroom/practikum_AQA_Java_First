import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main (String[] args){
        Food meat = new Meat(5, 100);
        Food appleRed = new Apple(10, 50, Colour.RED);
        Food appleGreen = new Apple(8, 60, Colour.GREEN);

        var cart = new ShoppingCart(new Food[] {meat, appleRed, appleGreen});

        System.out.println("Сумма покупок без скидок: " + cart.totalCartPrice());
        System.out.println("Сумма покупок со скидками: " + cart.disCountPrice());
        System.out.println("Сумма вегетарианских покупок без скидок: " + cart.vegetarianPrice());
    }
}
