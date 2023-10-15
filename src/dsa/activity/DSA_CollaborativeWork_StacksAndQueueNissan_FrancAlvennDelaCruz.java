
package dsa.activity;

import java.util.*;


public class DSA_CollaborativeWork_StacksAndQueueNissan_FrancAlvennDelaCruz {

     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sizeOfCollection;
        int noOfItemsToRemove = 0;
        int sumOfStack = 0;
        int sumOfQueue = 0;
        int maxValue = 0;
        
        //declaration of stack and queue
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        System.out.println("STACKS AND QUEUES (NISSAN)");
        System.out.println("---------------------------------------------------------");
        System.out.print("Please enter the size of the collection: ");
        sizeOfCollection = input.nextByte();
        
        System.out.print("Please enter the number of items to remove: ");
        noOfItemsToRemove = input.nextInt();
        
        while (noOfItemsToRemove > sizeOfCollection){
            System.out.println("INVALID. The number of items to remove must be less than the size of the collection.");
            System.out.print("\nPlease enter the number of items to remove: ");
            noOfItemsToRemove = input.nextInt();
            System.out.println("---------------------------------------------------------");
        }
        
        
        int[] array = new int[sizeOfCollection];
        
        //loop to get value of array
        for(int i = 0;i<sizeOfCollection;i++){
            System.out.print("Please enter a value: ");
            int _temp = input.nextInt();
            array[i] = _temp;
            if(i >= sizeOfCollection-noOfItemsToRemove) sumOfQueue += array[i];
        }
        
        //loop to push and add value to stack and queue
        for(int i = array.length -1; i>=0;i--){
            stack.push(array[i]);  
        }
        
        //loop to get queue set from the value of k
        for(int i = sizeOfCollection-noOfItemsToRemove; i<= array.length - 1;i++){
            queue.add(array[i]);
        }
        
        //loop to get sum
        for(int i = 0; i < noOfItemsToRemove; i++){
                    //get value from stack
	            sumOfStack += stack.pop();
                    //get value from queue
	            sumOfQueue -= queue.poll();
	            maxValue = Math.max(maxValue,sumOfStack+sumOfQueue);
	        }

        System.out.println("---------------------------------------------------------");
         System.out.println("The highest sum possible from the removed items is: " + maxValue);
         
         
    }


}
