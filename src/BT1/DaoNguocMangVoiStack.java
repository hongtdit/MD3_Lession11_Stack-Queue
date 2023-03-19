package BT1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DaoNguocMangVoiStack {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            stack.push(arrayList.get(i));
        }

        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, stack.pop());
        }
        System.out.println(arrayList);
        String string = "abcd";
        String[] splitString = string.split("");
        System.out.println(string);
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < splitString.length; i++) {
            stringStack.push(splitString[i]);
        }
        for (int i = 0; i < splitString.length; i++) {
            splitString[i] = stringStack.pop();
        }
//        System.out.println(Arrays.toString(splitString));
        String newString = "";
        for (int i = 0; i < splitString.length; i++) {
            newString+=splitString[i];
        }
        System.out.println(newString);
    }
}
