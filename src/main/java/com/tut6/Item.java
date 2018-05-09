package com.tut6;

public class Item {
    private Integer code;
    private String name;
    private Integer price;
    private Category category;
    private Seller seller;

    public Item() {
    }

    public Item(Integer code, String name, Integer price, Category category, Seller seller) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.category = category;
        this.seller = seller;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }
}
