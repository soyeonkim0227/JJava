package org.opentutorials.javatutorials.Chap03;

import java.util.Scanner;

// 정숫값을 읽어서 절댓값을 표시 (방법2)
public class Absolute2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();
        int abs;

        if (n >= 0)
            abs = n;
        else
            abs = -n;
        System.out.println("절댓값은 " + abs + "입니다.");
    }
}
