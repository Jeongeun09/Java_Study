package Practice;

import java.util.Scanner;

public class Vlog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("가격을 입력해주세요:");
        int price = scanner.nextInt();

        System.out.print("수량을 입력해주세요.:");
        int quantiny = scanner.nextInt();

        int totalPrice = price * quantiny;

        System.out.println("총 비용:" + totalPrice);


    }
}
