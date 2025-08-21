package Scanner;

import java.util.Scanner;

public class Ex_Bad1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.print("숫자를 입력해주세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            sum += input;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
