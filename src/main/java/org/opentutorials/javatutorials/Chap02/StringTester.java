package org.opentutorials.javatutorials.Chap02;

// 문자열 초기화와 대입
public class StringTester {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "XYZ";

        System.out.println("문자열 s1은 " + s1 + "입니다.");
        System.out.println("문자열 s2는 " + s2 + "입니다.");

        s1 = "FBI";
        System.out.println("문자열 s1은 " + s1 + "입니다.");
        System.out.println("문자열 s2는 " + s2 + "입니다.");
    }
}
