package Practice;

public class Scope_Ex {

    public static void main(String[] args) {
        int number = 10; // number 생존 시작
        for (int i = 0; i < 2; i++) { // for문 내에서 i 생존 시작
            System.out.println("number = " + number); //블록 내에서 외로 접근 가능
            System.out.println("i = " + i);
        } // i 생존 종료
        System.out.println("number = " + number);
        // System.out.println("i = " + i); i의 생존 범위가 아니기 때문에 i 접근 못함.
    }
}
