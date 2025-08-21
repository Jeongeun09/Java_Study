package Array;

import java.util.Scanner;

public class Ex_Array5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력해주세요:");
        int count = input.nextInt();

        int numbers[] = new int[count];
        int big_Number = 0;
        int small_Number = 0;

        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numbers[i] = input.nextInt();
        }

        small_Number = big_Number = numbers[0];
        for (int i = 1; i < count; i++) {
            if (numbers[i] >= big_Number) {
                big_Number = numbers[i];
            }
            if (numbers[i] <= small_Number) {
                small_Number = numbers[i];
            }
        }
        System.out.println("가장 큰 값 : " + big_Number);
        System.out.println("가장 작은 값 : " + small_Number);
    }
}
