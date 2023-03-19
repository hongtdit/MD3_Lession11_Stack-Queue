package BT5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi: ");
        String string = sc.nextLine();
        boolean flag = true;
        Stack<String> stackString = new Stack<>();
        Queue<String> queueString = new LinkedList<>();
        String[] part = string.split("");
        for (int i = 0; i < part.length; i++) {
            stackString.push(part[i]);
        }
        for (int i = 0; i < part.length; i++) {
            queueString.add(part[i]);
        }
        while (!stackString.isEmpty()) {
            if (!stackString.pop().equalsIgnoreCase(queueString.poll())){
                System.out.println("Chuỗi trên không phải chuỗi đảo ngược.");
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("Chuỗi trên là chuỗi đảo ngược.");
    }
}
