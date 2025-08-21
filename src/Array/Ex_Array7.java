package Array;

import java.util.Scanner;

public class Ex_Array7 {

    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productsNames = new String[maxProducts];
        int[] productsPrice = new int[maxProducts];
        int productscount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {

                if (productscount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }
                System.out.print("상품 이름을 입력해주세요:");
                productsNames[productscount] = scanner.nextLine();

                System.out.print("상품 가격을 입력해주세요:");
                productsPrice[productscount] = scanner.nextInt();
                productscount++;
            }
            else if (menu == 2) {
                if (productscount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
               for (int i = 0; i < productscount; i++) {
                   System.out.println(productsNames[i] + ": " + productsPrice[i] + "원");
               }
            }
            else if (menu == 3) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}
