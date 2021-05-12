package com.company;

public class Main {

    public static void main(String[] args) {
        Person ppl1 = new Person("Bill", "Bill@gmail.com");
        Business ppl11 = new Business("Bill", "Bill@gmail.com", "614-555-5555");

        ppl11.display();
        ppl1.display();
    }
}