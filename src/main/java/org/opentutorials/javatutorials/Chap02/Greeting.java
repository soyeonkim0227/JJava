package org.opentutorials.javatutorials.Chap02;

import java.util.Scanner;

// 입력한 성과 이름을 인사
public class Greeting {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("성 : "); String lastName = stdIn.next();
        System.out.print("이름 : "); String firstName = stdIn.next();
        System.out.println("안녕하세요. " + lastName + firstName + "씨.");
    }
}
