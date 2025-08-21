package Scanner;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름(foodname)을 입력해주세요:");
        String foodname = scanner.nextLine();

        System.out.print("가격(foodPrice)을 입력해주세요:");
        int foodPrice = scanner.nextInt();

        System.out.print("수량(foodQuantiny)을 입력해주세요:");
        int foodQuantiny = scanner.nextInt();

        int tatalPrice = foodPrice * foodQuantiny;

        System.out.println(foodname + " " + foodQuantiny + "개를 주문하셨습니다." + " 총 가격은 " + tatalPrice + "원입니다.");
    }
}
