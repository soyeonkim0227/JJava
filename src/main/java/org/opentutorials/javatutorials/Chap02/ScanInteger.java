package org.opentutorials.javatutorials.Chap02;

import java.util.Scanner;

// 키보드에서 입력한 정숫값 표시
public class ScanInteger {
    public static void main(String[] args) {
        // main 메서드의 시작 부분에 작성한다.
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수값 : ");
        // 키보드를 통해 입력한 정숫값을 받는다.
        int x = stdIn.nextInt(); // 입력받은 정숫값을 x에 저장한다.
        System.out.println(x + "를 입력했습니다.");
    }
}
