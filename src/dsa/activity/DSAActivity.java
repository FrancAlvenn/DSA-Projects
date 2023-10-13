package dsa.activity;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DSAActivity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Integer> list1 = new LinkedList();
        LinkedList<Integer> nodes = new LinkedList();
//input to get number of Items for list
        System.out.print("Please input the number of items for list 1: ");
        int _temp = input.nextInt();
//loop to get the value for loop
        for (int i = 1; i <= _temp; i++) {
            System.out.print("Please input the value: ");
            int _tempInput = input.nextInt();
            list1.add(_tempInput);
        }
        System.out.println(Arrays.toString(list1.toArray()).replace(",", "").replace("[", "").replace("]", ""));
        int _looper = 1;
        while (_looper == 1) {
            System.out.println("-------------------------------------------------------");
            System.out.print("Please input the number of nodes: ");
            _temp = input.nextInt();
            System.out.println("-------------------------------------------------------");
            for (int i = list1.size(); i >= (list1.size() - _temp) + 1; i--) {
                nodes.add(list1.get(i - 1));
            }
            System.out.println("Last " + _temp + " nodes from the end of the said singly list:");
            for (int i = nodes.size() - 1; i >= 0; i--) {
                System.out.print(nodes.get(i) + " ");
            }
            System.out.println("");
            System.out.println("-------------------------------------------------------");
            System.out.println("Continue?");
            System.out.println("0 for NO");
            System.out.println("1 for YES");
            _looper = input.nextInt();
            nodes.clear();
        }
    }
}
