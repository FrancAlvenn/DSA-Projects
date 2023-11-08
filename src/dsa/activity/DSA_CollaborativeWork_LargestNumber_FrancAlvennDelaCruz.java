package dsa.activity;
import java.util.*;
public class DSA_CollaborativeWork_LargestNumber_FrancAlvennDelaCruz {
    
    /*
    Change the class name to the class name of you java class as well as
    the package name
    
    NOTE:
    The first input should be a number value
    
    The second input should not be equal or greater than the length of the 
    first input
    */
    
    
    //funtion to convert the seperated integer into an array
    public static int[] intToArray(int n) {
        String numberString = Integer.toString(n);
        int[] result = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            result[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int noOfItemsToRemove;
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("LARGEST NUMBER");
        System.out.println("--------------------------------------------");
        System.out.print("Input the value of number: ");
        number = input.nextInt();
        
        while (number < 1){
            System.out.println("Invalid. Integer must be greater than 0.");
            System.out.print("\nInput an integer: ");
            number = input.nextInt();
            System.out.println("--------------------------------------------");
        }
        
        
        //function call
        int[] array = intToArray(number);
        
        //insert array value into stack
        for(int i = 0;i<array.length;i++){
            stack.push(array[i]);
        }
        
        System.out.print("Input number of items to remove: ");
        noOfItemsToRemove = input.nextInt();
        System.out.println("--------------------------------------------");
        
        while (noOfItemsToRemove < 0 || noOfItemsToRemove > array.length){
                    System.out.println("Input must be between 0 and " + (array.length));
                    System.out.print("Input number of items to remove: ");
                    noOfItemsToRemove = input.nextInt();
                    System.out.println("--------------------------------------------");
                }
        
        //pop stack based on noOfItemsToRemove
        for(int j = 0; j < noOfItemsToRemove; j++){
            stack.pop();
        }
        
        //new array after pop()
        Integer[] sortedArray = stack.toArray(Integer[]::new);
        
        //sort array to get the highest calue possible
        Arrays.sort(sortedArray, Comparator.reverseOrder());
        
        System.out.print("The highest value possible is: ");
        for (Integer output : sortedArray) {
            System.out.print(output);
        }
        System.out.println("");
        System.out.println("--------------------------------------------");
        System.out.println("THANK YOU!");
        
    }
}
