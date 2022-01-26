package com.company;

public class Triangle {
    int a;
    int b;
    int c;


    public double area() {
        double semiperim = (a + b + c) / 2;
        return Math.sqrt(semiperim * (semiperim - a) * (semiperim - b) * (semiperim - c));


    }
}
