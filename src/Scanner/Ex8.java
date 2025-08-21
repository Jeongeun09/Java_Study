package Scanner;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("가격을 입력해주세요(-1을 입력하면 종료):");
            int Price = input.nextInt();

            if (Price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("수량을 입력해주세요:");
            int quantiny = input.nextInt();

            int tatalPice = Price * quantiny;

            System.out.println("총 비용 : " + tatalPice);
        }
    }
}
