package com.company.Lab02;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       int input = Integer.parseInt(scanner.nextLine());
       BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= input; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);

        }
        System.out.println(sum);
        }
    }

