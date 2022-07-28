package org.opentutorials.javatutorials.Chap04;

import java.util.Scanner;

// 1부터 n까지의 합 구하기 (계산식을 표시)
public class SumUpForExp {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n;
        do {
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);
        int sum = 0;
        for (int i = 1; i< n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }
        System.out.print(n + " = ");
        sum += n;
        System.out.println(sum);

    }
}
