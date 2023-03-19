package BT2;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        Scanner sc = new Scanner(System.in);
        String string = "";
        System.out.println("Nhap chuoi");
        string = sc.nextLine();
        String[] strings = string.split("");
        for (int i = 0; i < strings.length; i++) {
            if (treeMap.containsKey(strings[i].toUpperCase())) {
                int value= (int)treeMap.get(strings[i].toUpperCase());
                treeMap.replace(strings[i].toUpperCase(),value+1);
            } else {
                treeMap.put(strings[i].toUpperCase(), 1);
            }
        }
        System.out.println(treeMap);

    }
}
