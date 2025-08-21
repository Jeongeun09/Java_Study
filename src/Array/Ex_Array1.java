package Array;

public class Ex_Array1 {

    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        int total = 0;
        for (int j : student) {
            total += j;

        }
            double average = (double) total / 5;
            System.out.println("총합 : " + total);
            System.out.println("평균 : " + average);

    }
}