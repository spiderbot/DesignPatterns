package org.piyush.joshi.designpatterns.decorator;

public class ApplicationStarter {
    public static void main(String[] args) {
        BaseCart cart = new UserCart();
        cart = new GSTDecorator(cart);
        System.out.println(cart.calculateCartPrice());

        cart = new DeliveryFeeDecorator(cart);

        System.out.println(cart.calculateCartPrice());
    }
}
