package com.company.exam4;

import java.util.ArrayList;
import java.util.Random;

public class Exam4 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> library = new ArrayList<>();
        Random rnd = new Random();
        for(int i = 0; i < 500; i++){
            books.add(new Book(rnd.nextInt(1000) + 200,rnd.nextInt(60) + 1960));
        }
        int count = 0;
        for(int i = 1960; i < 2020; i++){
            for(int j = 0; j < books.size(); j++){
                if(books.get(j).getYear() == i){
                    books.get(j).changeGiveCode();
                    library.add(books.get(j));
                }
            }
        }
        System.out.println(books);
        System.out.println(library);
    }
}

class Book{
    private static int count;
    private String code;
    private double price;
    private int year;

    void changeGiveCode(){
        count++;
        code = "ИБ" + count;
        if(count <= 10){
            this.price = price / 2.;
        }else
            this.price = price;
    }

    public Book(double price, int year) {
        this.price = price;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(count <= 10){
            this.price = price / 2.;
        }else
            this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" + code + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}' + '\n';
    }
}
