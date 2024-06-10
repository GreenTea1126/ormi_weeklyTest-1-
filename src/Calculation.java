import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("원하는 기능을 선택하세요");
            System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 0.종료");
            int select = sc.nextInt();
            if (select == 0) {
                break;
            } else if (select > 4) {
                System.out.println("올바른 선택이 아닙니다.");
                continue;
            }
            System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
            int a = sc.nextInt();
            System.out.println("두번째 값을 입력하고 엔터를 누르세요");
            int b = sc.nextInt();
            System.out.println("결과 :" + calc(select, a, b));
        }

    }

    public static int calc(int select, int a, int b) {
        int result = 0;
        if (select == 1) {
            result = a + b;
        } else if (select == 2) {
            result = a - b;
        } else if (select == 3) {
            result = a * b;
        } else if (select == 4) {
            result = a / b;
        }
        return result;
    }
}
