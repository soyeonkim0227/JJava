package org.opentutorials.javatutorials.Chap03;

import java.util.Scanner;

// 가져온 정수 값은 약 몇인지 여부 (논리 부정 연산자)
public class Measure2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("변수 A : "); int a = stdIn.nextInt();
        System.out.print("변수 B : "); int b = stdIn.nextInt();

        if (!(a % b == 0))
            System.out.println("B는 A의 약수가 아닙니다.");
        else
            System.out.println("B는 A의 약수입니다.");
    }
}
