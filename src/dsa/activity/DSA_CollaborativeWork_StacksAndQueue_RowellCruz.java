package dsa.activity;
import java.util.*;
public class DSA_CollaborativeWork_StacksAndQueue_RowellCruz {
    public static void convertStackToQueue(Stack<Integer> stk, Queue<Integer> queue, int N){
        for(int i = 0; i < N; i++) queue.add(stk.pop());
    }
    
    public static int getMaxSum(Queue<Integer> queue, int N, int K){
        int frontValue[] = new int[K];
        int rearValue[] = new int[K];
        int maxValues[] = new int[K];
        
        for(int i = 1; i <= K; i++){
            for(int j = 0; j < i; j++){
                frontValue[i-1] += queue.peek();
                queue.add(queue.poll());
            }
            for(int j = 0; j < (N - K); j++){
                queue.add(queue.poll());
            }
            for(int j = 0; j < (K - i); j++){
                rearValue[i-1] += queue.peek();
                queue.add(queue.poll());
            }
        }
        
        for(int i = 0; i < K; i++) maxValues[i] = frontValue[i] + rearValue[i]; 
        
        int max = maxValues[0];
        for (int i = 1; i < maxValues.length; i++) {
            if (maxValues[i] > max) {
                max = maxValues[i];
            }
        }
        
        return max;
    }
    
	public static void main(String[] args) {
	    //Declaration of Scanner, Stack, and Queue
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        
        //Getting the Value for N and K or Stack Size and Elements to be removed
        System.out.print("Enter Stack Size: ");
        int N = scanner.nextInt();
        System.out.print("Enter no. of elements to be removed: ");
        int K = scanner.nextInt();
        
        //Getting the N elements for Stack
        for(int i = 0; i < N; i++){
            System.out.print("Enter element: ");
            stk1.push(scanner.nextInt());
        }
        for( ; !stk1.isEmpty(); ) stk2.push(stk1.pop());
        
        convertStackToQueue(stk2, queue, N);
        System.out.print("Maximum Value: " + getMaxSum(queue, N, K));
        
	}
}
