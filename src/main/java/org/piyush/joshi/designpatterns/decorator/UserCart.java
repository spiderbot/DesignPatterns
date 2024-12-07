package org.piyush.joshi.designpatterns.decorator;

import java.util.List;

public class UserCart extends BaseCart{

    List<CartItem> cartItemList;

    @Override
    public double calculateCartPrice() {
        return 10;
    }
}
