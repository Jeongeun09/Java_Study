package Scanner;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "은 짝수입니다.");
        }
        else if (number % 2 == 1) {
            System.out.println("입력한 숫자 " + number + "은 홀수입니다.");
        }

    }
}
