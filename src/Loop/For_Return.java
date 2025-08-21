package Loop;

public class For_Return {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 5;

        for (int i = 0; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i= " + i + " sum=" + sum);
        }
    }
}
