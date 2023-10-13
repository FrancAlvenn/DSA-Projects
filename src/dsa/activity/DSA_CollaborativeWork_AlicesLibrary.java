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
        String[] parts = null;
        
        int _loop = 0;
        while (_loop <= 2){
        System.out.println("ALICE'S LIBRARY");
        System.out.println("""
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
        parts = book.split("[/\\\\]");
        
        
        _loop = parts.length;
        if(_loop > 2) break;
        System.out.println("---------------------------------------------------------");
        System.out.println("INVALID. There must be at least 3 books in Alice's Library!");
        System.out.println("---------------------------------------------------------");
        }
        
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
