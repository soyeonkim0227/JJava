package org.opentutorials.javatutorials.Chap02;

import java.util.Scanner;

// 삼각형의 넓이를 구해서 표시
public class Triangle {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("삼각형의 넓이를 구합니다.");

        System.out.print("밑변 : ");
        double width = stdIn.nextDouble();

        System.out.print("높이 : ");
        double height = stdIn.nextDouble();

        System.out.println("넓이는 " + (width * height / 2) +"입니다.");
    }
}
