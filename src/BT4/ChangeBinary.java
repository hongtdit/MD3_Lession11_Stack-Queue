package BT4;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String result = "";
        System.out.println("Đổi 1 số từ hệ thập phân sang nhị phân.");
        do {
            System.out.println("Nhập vào 1 số: ");
            num = sc.nextInt();
        } while (num < 0);
        Stack binary = new Stack<>();
        while (num > 0) {
            binary.push(num % 2);
            num = num / 2;
        }
        while (!binary.isEmpty()){
            result += binary.pop();
        }
        System.out.println("Hệ nhị phân của số trên là -->" + result);
    }
}
