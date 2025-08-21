package Loop;

public class While_Return {

    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int endNum = 3;

        while (i <= endNum) {

            count = count + i;
            System.out.println("i=" + i + " count=" + count);
            i++;
        }
    }
}
