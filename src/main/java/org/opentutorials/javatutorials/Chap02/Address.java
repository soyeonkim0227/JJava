package org.opentutorials.javatutorials.Chap02;

import java.util.Scanner;

// 주소를 읽어서 표시
public class Address {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("주소 : ");
        String address = stdIn.nextLine();

        System.out.print("주소는 " + address + "입니다.");
    }
}
