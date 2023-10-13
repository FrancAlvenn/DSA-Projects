package dsa.activity;
import java.util.*;
public class DSA_CollaborativeWork_AlicesLibrary {
    
    
    
    
    static Stack pushBooks (Stack stack, String[] part){
        
        // push individual values onto the stack
        for (String parts : part) {
            if (!parts.isEmpty()) {
                stack.push(parts);
            }
        }

        return stack;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stackOfBooks = new Stack<>();
        String book;
        
        System.out.println("ALICE'S LIBRARY");
        System.out.println("""
                           \n
                           NOTE: Opening and closing walls of shelves are shown by
                                 '/' and '\\\' respectively whereas books are represented by 
                                 lower case alphabets.
                            """);
        System.out.println("---------------------------------------------------------");
        System.out.print("Please enter Alice's Library: ");
        book = input.nextLine();
        
        // remove leading and trailing slashes
        book = book.replaceAll("^/|/$", "");

        // split the string using regular expression
        String[] parts = book.split("[/\\\\]");
        
        //function call
        pushBooks(stackOfBooks,parts);
 
        //insert value of stack into an array to sort it
        String[] sortedArray = stackOfBooks.toArray(String[]::new);
        
        // Reverse the array
        for (int i = 0; i < sortedArray.length / 2; i++) {
            String temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        
        //output the sorted result
        System.out.println("---------------------------------------------------------");
        for (String output : sortedArray) {
            System.out.print(output);
        }
        
        System.out.println("");
    }
    
}
