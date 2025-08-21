package Operator;

public class Switch3 {

    public static void main(String[] args) {
        // 14 Java 도입된 새로운 Switch문
        // 기존 Switch문과 다른 점
        // 1. ->을 사용함
        // 2. 선택된 데이터를 반환 가능
        int grade = 2;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
