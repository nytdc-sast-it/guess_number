package org.tdsast;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== 猜数字游戏 =====");
        System.out.print("请输入你猜的数字：");
        int inputNum = scanner.nextInt();
        System.out.println("你刚才输入的数字是 " + inputNum);

        scanner.close();
    }
}
