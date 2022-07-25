package org.opentutorials.javatutorials.Chap03;

import java.util.Scanner;

// 정숫값을 읽어서 절댓값을 표시 (방법1)
public class Absolute1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : ");
        int n = stdIn.nextInt();

        if (n >= 0)
            System.out.println("절댓값은 " + n + "입니다.");
        else
            System.out.println("절댓값은 " + -n + "입니다.");
    }
}
