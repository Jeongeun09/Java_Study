package Scanner;

import java.util.Scanner;

public class Scanner_While3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

      while (true) {
          System.out.print("첫 번째 숫자를 입력해주세요.:");
          int num1 = input.nextInt();

          if (num1 == 0) {
              break;
          }
          sum += num1;

      }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
