package Array;

public class ArrayDi2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.print(number);
        }
        System.out.println();

        // 향상된 for문, for-each문

        for (int number : numbers) {
            System.out.print(number);
        }


    }
}
