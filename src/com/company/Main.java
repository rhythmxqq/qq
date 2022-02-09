package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //(-1)^n*x^(n+1)\(n+1)
        Scanner in = new Scanner(System.in);
        System.out.println("Ввевидете кол-во шагов, если оно будет отрицательным программа закроется");
        int zxc = in.nextInt(); //кол-во шагов
        System.out.println("Введите число x");
        double qq = in.nextDouble();
        double gg = 0;
        if (zxc < 0)
            System.out.println("вы ввели отрицательное число шагов");


        for (int i = 0; i <= zxc; i++) {
            if (zxc < 0) {
                System.out.println("вы ввели отрицательное число шагов");
                break;
            }
            else {

                    qq = (Math.pow(-1, i)) * (Math.pow(qq, (i + 1))) / (i + 1);
                    gg += qq;
                    System.out.println(gg);
                }

            }
        }

    }


