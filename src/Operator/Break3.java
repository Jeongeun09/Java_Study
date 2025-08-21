package Operator;

public class Break3 {

    public static void main(String[] args) {
        int sum = 5;

        for(int i = 8; i < 10; i++) {
            sum += 1;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료 : i=" + i + "sum=" + sum);
                break;
            }
            i++;
        }
    }
}
