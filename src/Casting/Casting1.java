package Casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long (작은 것에서 큰 것으로 넣을 수 있다.)
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // double -> int
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20l;// long -> double
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
