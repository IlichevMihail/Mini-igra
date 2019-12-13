package com.company;

import java.util.Random;

public  class Otveti {
    private int a;
    private int d;
    private Random scan;
    int n = scan.nextInt();
    public int getOtvet1() {
        this.a = a;
        a = 256;
        if (n == a) {
            n = 0;
        }

        return a;
    }

    public int getOtvet2() {
        this.d = d;
        d = 4;
        if (n == d) {
            n = 0;
        }
        return d;
    }
}