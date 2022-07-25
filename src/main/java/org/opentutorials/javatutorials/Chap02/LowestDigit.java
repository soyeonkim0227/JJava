package org.opentutorials.javatutorials.Chap02;

import java.util.Scanner;

// 키보드에서 입력한 정숫값에 마지막 자릿수를 제외한 값과 마지막 자릿수를 표시
public class LowestDigit {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 : ");
        int x = stdIn.nextInt();

        System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다.");
        System.out.println("마지막 자릿수는 " + (x % 10) + "입니다.");
    }
}
