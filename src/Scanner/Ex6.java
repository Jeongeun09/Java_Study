package Scanner;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("첫 번째 수를 입력해주세요.:");
        int num1 = input.nextInt();

        System.out.print("두 번째 수를 입력해주세요.:");
        int num2 = input.nextInt();
        int temp = 0;

        if (num1 > num2) {
            num1 = temp;
            num1 = num2;
            num2 = temp;
        }
            System.out.print("두 수 사이의 있는 모든 정수: " );
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2)
            System.out.print(",");
        }

    }
}
