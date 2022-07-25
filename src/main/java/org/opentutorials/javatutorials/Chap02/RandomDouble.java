package org.opentutorials.javatutorials.Chap02;

import java.util.Random;

// 실수의 난수를 생성해서 표시
public class RandomDouble {
    public static void main(String[] args) {
        Random rand = new Random();

        double x1 = rand.nextDouble(); // 0.0이상  1.0미만
        double x2 = -1 - rand.nextDouble() * 10; // 0.0이상 10.0미만
        double x3 = -1 + 2 * rand.nextDouble(); // -1.0이상  1.0미만

        System.out.println("3개의 난수를 생성했습니다.");
        System.out.println(" 0.0이상  1.0미만 : " + x1);
        System.out.println(" 0.0이상 10.0미만 : " + x2);
        System.out.println("-1.0이상  1.0미만 : " + x3);
    }
}
