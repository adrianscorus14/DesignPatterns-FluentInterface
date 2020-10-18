package fluentinterface;

import fluentinterface.example.RestaurantImpl;

import java.util.Arrays;

public class FluentInterfaceMain {
    public static void main(String[] args) {
        new RestaurantImpl().name("Primavera").getMenu().orderPizza(Arrays.asList(new Integer[]{1, 3})).eatPizza().payPizza();
    }
}
