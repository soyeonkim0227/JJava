package org.opentutorials.javatutorials.Chap02;

// 2개의 변수 x와 y의 합과 평균을 표시
public class SumAve1 {
    public static void main(String[] args) {
        int x;
        int y;

        x = 63;
        y = 18;

        System.out.println("x값은 " + x + "입니다.");
        System.out.println("y값은 " + y + "입니다.");
        System.out.println("합계는 " + (x + y) + "입니다.");
        System.out.println("평균은 " + (x + y) / 2 + "입니다.");
    }
}
