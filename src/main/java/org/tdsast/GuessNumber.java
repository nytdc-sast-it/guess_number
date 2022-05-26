package org.tdsast;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);

        System.out.println("===== 猜数字游戏 =====");
        while (true) {
            int inputNum = Integer.MIN_VALUE;
            do {
                System.out.print("请输入你猜的数字：");
                try {
                    inputNum = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("请输入数字！");
                    scanner.next();     // 清除错误的输入
                }
            } while (inputNum == Integer.MIN_VALUE);

            if (inputNum > number) {
                System.out.println("大了");
            } else if (inputNum < number) {
                System.out.println("小了");
            } else {
                System.out.println("猜对了");
                break;
            }
        }

        scanner.close();
    }
}
