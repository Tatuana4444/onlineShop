package com.epam.shop.entity;


import java.util.Objects;

public class Product extends Entity{

    private String name;
    private String description;
    private int price;
    private boolean status;


    /**
     * Getter for product name
     * @return product name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for product name
     * @param value product name
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * @return product description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter for product description
     * @param value new description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Getter for product price
     * @return product price
     */
    public int getPrice() {
        return price;
    }

    /**
     * Setter for price
     * @param value new price
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Getter for product status
     * @return product status
     */
    public boolean getStatus() {
        return status;
    }

    /**
     * Setter for product status
     * @param status product status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    /**
     * Compare object with this product
     * @param o object with which it will be compare
     * @return it will return true if objects are equal
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Product product = (Product) o;
        return price == product.price &&
                status == product.status &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);
    }
    /**
     * Do hash code
     * @return hash code of product
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, description, price, status);
    }
}
