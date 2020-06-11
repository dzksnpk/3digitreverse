package com.company;

import java.util.Scanner;

/// reverse 3 digit number from user input
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int firstNum = number / 100;
        int secondNum = (number / 10) % 10;
        int thirdNum = number % 10;

        System.out.println(100 * thirdNum + 10 * secondNum + firstNum);
    }
}