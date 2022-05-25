package org.tdsast;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("生成的数字是：" + number);

        System.out.println("===== 猜数字游戏 =====");
        System.out.print("请输入你猜的数字：");
        int inputNum = scanner.nextInt();
        System.out.println("你刚才输入的数字是 " + inputNum);

        if (inputNum > number) {
            System.out.println("大了");
        } else if (inputNum < number) {
            System.out.println("小了");
        } else {
            System.out.println("猜对了");
        }

        scanner.close();
    }
}
