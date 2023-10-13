
package dsa.activity;

import java.util.*;


public class DSA_CollaborativeWork_Test {
     public static void main(String[] args) {
        int n;
        int k;
        int sumOfK = 0, sum = 0;
        int max = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("STACKS AND QUEUES (NISSAN)");
        System.out.println("---------------------------------------------------------");
        System.out.print("Please enter the size of the stack: ");
        n = input.nextByte();
        System.out.print("Please enter the number of items: ");
        k = input.nextInt();
        
        
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i < n;i++){
            System.out.print("Please enter a value: ");
            int _temp = input.nextInt();
            stack.push(_temp);
            if(i >= n-k){
                sumOfK += stack.peek();
            }
        } 
        
        int[] array = stackToIntArray(stack);
        for(int i = 0; i < k; i++){
	            sum += array[i];
	            sumOfK -= array[n-k+i];
	            max = Math.max(max,sum+sumOfK);
	        }
        
        System.out.println("The Maximum value is: " + max);
        
    }
     
    public static int[] stackToIntArray(Stack<Integer> stack) {
        int[] result = new int[stack.size()];
        int index = 0;

        while (!stack.isEmpty()) {
            result[index++] = stack.pop();
        }

        return result;
    }
}
