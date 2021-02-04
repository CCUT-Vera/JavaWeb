package com.wondersgroup.pojo;

import java.math.BigDecimal;

/**
 * @description:
 * @author: Wei Tengfei
 * @date: Created in 2021/2/4 10:31 下午
 * @version: v1.0
 */
public class Book {
    public String sn;
    private String name;
    private String author;
    private Double price;

    @Override
    public String toString() {
        return "Book{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public Book() {
    }

    public Book(String sn, String name, String author, Double price) {
        this.sn = sn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
