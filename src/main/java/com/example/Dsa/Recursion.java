package com.example.Dsa;

public class Recursion {
    public static void main(String[] args) {
        System.out.println("Recursion class created");
        f1(10);
    }

    public static void f1(int i) {
        System.out.println(i);
        if (i > 0) {
            f1(i - 1);
        }
    }
}
