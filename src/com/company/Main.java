package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Otveti f = new Otveti();
        Scanner scan = new Scanner(System.in);
        System.out.println("Привет! Сыграешь в арифметическую викторину? Напиши 'да' или 'нет'");
        int otvet = scan.nextInt();
        int n = scan.nextInt();
        int k = 3;
        while ( k != 0) {
        if (otvet == n) {
            System.out.println("Правильно! Приготовтесь к следующему вопросу");
            k=k-1;
        }
        else {
            System.out.println("НЕВЕРНО! Вы проиграли! На пересдачу к Карпову!");
            k=0;
        }

        }
    }
}