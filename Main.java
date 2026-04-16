import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //EXAMPLE 1: Demonstrate ArrayList add() and remove()
        Functions.ArrayListAddRemove(input);

        //EXAMPLE 2: Demonstrate LinkedList add() and remove()
        Functions.LinkedListAddRemove(input);        
        
        //EXAMPLE 3: Demonstrate LinkedList Using Class Sample
        Functions.LinkedListDemo();      

                
        //EXAMPLE 4: Print a List in Reverse
        Functions.StackDemo();  
    }
}

