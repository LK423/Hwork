import java.util.Scanner;

public class Hwork3 {
    public static void main(String[] args) {
        System.out.println("请输入一个数(判断是否为回文数)");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPalindrome(num);
    }

    public static void isPalindrome(int x) {
        int n = 0;
        int m = x;
        while (x > 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
            if (n == m) {
                System.out.println("是");
            } else {
                System.out.println("否");
            }

    }
}