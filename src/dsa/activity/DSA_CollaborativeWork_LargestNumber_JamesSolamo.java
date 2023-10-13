package dsa.activity;

import java.util.*;

public class DSA_CollaborativeWork_LargestNumber_JamesSolamo {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //Prompt the user to input an integer and store it in the variable N.
        System.out.print("Input an integer: ");
        int N = input.nextInt();
        
        //Check if the input integer is less than 1.
        //If it is, prompt the user to input again until a valid integer is provided.
        while (N < 1){
            System.out.println("Invalid. Integer must be greater than 0.");
            System.out.print("\nInput an integer: ");
            N = input.nextInt();
        }
        
            //Convert the integer N to a string and store it in the digit variable.
            //Get the length of the string and store it in D.
            String digit = Integer.toString(N);
            int D = digit.length();
            
            //Prompt the user to input the number of digits to remove (denoted as K) 
            //and validate that it is within the range [0, D - 1].
            System.out.print("Input K digit: ");
            int K = input.nextInt();
                while (K < 0 || K >= D){
                    System.out.println("K must be between 0 and " + (D - 1));
                    System.out.print("\nInput K digit: ");
                    K = input.nextInt();
                }
                
                    //Remove the last K digits from the string digit.
                    digit = digit.substring(0, D - K );
                    
                    //Parse the modified string back into an integer and store it in the num variable.  
                    int num = Integer.parseInt(digit);
                    
                    //Calculate the number of digits in the integer num 
                    //by looping through and dividing by 10, storing the count in the count variable.
                    int temp = num;
                    int count = 0;
                    while(temp != 0){
                        temp/= 10;
                        count++;
                    }
                    
                    //Create an integer array integers to store the individual digits of num.
                        int [] integers = new int[count];
                        temp = num;
                        
                        //Populate the integers array with the individual digits of num by iterating through num
                        //and using modulo and integer division.
                        for (int i = count -1 ; i >=0; i--){
                            integers[i] = temp % 10;
                            temp /= 10;
                        }
                        
                        //Sort the integers array in ascending order.
                        Arrays.sort(integers);
                        
                        //Reverse the order of elements in the integers array to get the largest possible number.
                        for (int i = 0; i < integers.length / 2; i++) {
                        temp = integers[i];
                        integers[i] = integers[integers.length - 1 - i];
                        integers[integers.length - 1 - i] = temp;
                        }
                        
                        //Build a string representation of the largest number by
                        //concatenating the elements of the sorted and reversed integers array.
                        StringBuilder sb = new StringBuilder();
                        for (int integer : integers){
                            sb.append(integer);
                        }
                        String string = sb.toString();
                        
                        //Print the largest number to the console.
                        System.out.println("\nLargest number: "+string);
    }
}
