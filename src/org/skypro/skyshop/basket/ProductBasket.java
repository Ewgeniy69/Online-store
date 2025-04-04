package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private final Product[] products;
    private int quantity;

    public ProductBasket() {
        this.products = new Product[5];
        this.quantity = 0;
    }

    public void addProduct(Product product) {
        if (quantity < products.length) {
            products[quantity] = product;
            quantity++;
        } else {
            System.out.println("Невозможно добавить продукт");
        }
    }

    public int getTotalAmount() {
        int total = 0;
        for (int i = 0; i < quantity; i++) {
            total += products[i].getPrice();
        }
        return total;
    }

    public void printCartContents() {
        if (quantity == 0) {
            System.out.println("В корзине пусто");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            System.out.println(products[i].getName() + " : " + products[i].getPrice());
        }
        System.out.println("Общая стоимость корзины: " + getTotalAmount());
    }

    public boolean containsProduct(String name) {
        for (int i = 0; i < quantity; i++) {
            if (products[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < quantity; i++) {
            products[i] = null;
        }
        quantity = 0;
    }


}





