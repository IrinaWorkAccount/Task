package de.BITConEx.ordermanagement.model;

import java.util.Date;

/**
 * A class that represents a product in the product catalog, including name, sale price, availability dates and quantity
 */

public class Product {
    private String name;
    private double salePrice;
    private Date availableFrom;
    private Date availableUntil;
    private int quantity;

    public Product(String name, double salePrice, Date availableFrom, Date availableUntil, int quantity) {
        this.name = name;
        this.salePrice = salePrice;
        this.availableFrom = availableFrom;
        this.availableUntil = availableUntil;
        this.quantity = quantity;
    }

    public String getProductName() {
        return name;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public double getProductSalePrice() {
        return salePrice;
    }

    public void setProductSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public Date getProductAvailableFrom() {
        return availableFrom;
    }

    public void setProductAvailableFrom(Date availableFrom) {
        this.availableFrom = availableFrom;
    }

    public Date getProductAvailableUntil() {
        return availableUntil;
    }

    public void setProductAvailableUntil(Date availableUntil) {
        this.availableUntil = availableUntil;
    }

    public int getProductQuantity() {
        return quantity;
    }

    public void setProductQuantity(int quantity) {
        this.quantity = quantity;
    }

}
