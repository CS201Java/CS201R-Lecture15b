import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Functions{

   //EXAMPLE 1: ArrayList Check
 
   public static void ArrayListAddRemove(Scanner scnr) {
 
      ArrayList<Integer> myInts = new ArrayList<Integer>(); // Dummy array list to demo ops
      int numElem;                                          // User defined array size
      int numOps;                                           // User defined number of inserts
      int i;                                                // Loop index

      System.out.print("\nEnter initial ArrayList size: ");
      numElem = scnr.nextInt();

      System.out.print("Enter number of ArrayList adds: ");
      numOps = scnr.nextInt();

      System.out.print("  Adding elements to ArrayList.......");

      long start = System.nanoTime();
      myInts.clear();
      for (i = 0; i < numOps; ++i) {
         myInts.add(0);
      }
      long end = System.nanoTime();
      long timeNano = end - start;
      
      System.out.println("done in " + timeNano);


      System.out.print("  Writing to each element............");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.set(i, 111); // Any value
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " additions at the end...");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.add(222); // Any value
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " additions at index 0...");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.add(0, 333);
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " removes................");

      for (i = 0; i < numOps; ++i) {
         myInts.remove(0);
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);
   }


   //EXAMPLE 2: LinkedList Check
 
   public static void LinkedListAddRemove(Scanner scnr) {
 
      MyLinkedList<Integer> myInts = new MyLinkedList<Integer>(); // Dummy array list to demo ops
      int numElem;                                                // User defined array size
      int numOps;                                                 // User defined number of inserts
      int i;                                                      // Loop index

      System.out.print("\nEnter initial LinkedList size: ");
      numElem = scnr.nextInt();

      System.out.print("Enter number of LinkedList adds: ");
      numOps = scnr.nextInt();

      System.out.print("  Adding elements to LinkedList.......");

      long start = System.nanoTime();

      for (i = 0; i < numOps; ++i) {
         myInts.addLast(110);
      }
      long end = System.nanoTime();
      long timeNano = end - start;
      
      System.out.println("done in " + timeNano);


      System.out.print("  Writing to each element............");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.set(i, 111); // Any value
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " additions at the end...");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.addLast(222); // Any value
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " additions at index 0...");
      start = System.nanoTime();
      for (i = 0; i < numOps; ++i) {
         myInts.addFirst(333);
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);


      System.out.print("  Doing " + numOps + " removes................");

      for (i = 0; i < numOps; ++i) {
         myInts.removeFirst();
      }
      end = System.nanoTime();
      timeNano = end - start;

      System.out.println("done in " + timeNano);
   }


   //EXAMPLE 3: LinkedList Demo
 
   public static void LinkedListDemo() {
 
      MyLinkedList<String> myList = new MyLinkedList<String>();  
 
      System.out.print("\nAddFirst(Yosemite) & AddFirst(Wiley): ");
      myList.addFirst("Yosemite");
      myList.addFirst("Wiley");
      System.out.println(myList);

      System.out.print("\nAddLast(Zelda): ");
      myList.addLast("Zelda");
      System.out.println(myList);

 
      System.out.println("\nRemove First (to empty list): ");
      System.out.println("  Removing: " + myList.removeFirst());
      System.out.println("  Removing: " + myList.removeFirst());
      System.out.println("  Removing: " + myList.removeFirst());
      System.out.println("  Removing: " + myList.removeFirst());
      System.out.println("  Current List: " + myList);

      System.out.print("\nRe adding to list: ");
      myList.addLast("Wiley");
      myList.addLast("Yosemite");
      myList.addLast("Zelda");
      System.out.println(myList);


      System.out.print("\nChanging Zelda to Bugs: ");
      myList.set(2, "Bugs");
      System.out.println(myList);
   }


   //EXAMPLE 4: Stack Demo
 
   public static void StackDemo() {
 
      System.out.println("\nSTACK EXAMPLES: REVERSE LIST");    
      MyStack<String> myStack = new MyStack<>();  
    
      ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Bugs","Wiley","Yosemite","Mickey","Charlie"));

      System.out.print("\nPush Names onto the Stack: ");
      for (String n : nameList)
        myStack.push(n); 

      System.out.println("Original List: " + nameList);
 
      int count = myStack.size();
      for (int i = 0; i < count; i++)
         System.out.println("  Popping top element:    " + myStack.pop());
   
      System.out.println("\nSTACK EXAMPLES: PALINDROME");
      ArrayList<String> palindromeList = new ArrayList<>(Arrays.asList("tacocat","mom","a","abba","abc"));
      MyStack<Character> myStack2 = new MyStack<>();  

      for (String word1 : palindromeList){
        myStack2.clear();
        boolean isPal = true;
        for (int i = 0; i < word1.length(); i++)
            myStack2.push(word1.charAt(i)); 

        for (int i = 0; i < word1.length(); i++){
            char a = myStack2.peek();
            if (a != word1.charAt(i)){
                isPal = false;
                break;
            }
            myStack2.pop();
        }
        if (isPal)  
            System.out.println("   " + word1 + " is a palindrome");
        else
            System.out.println("   " + word1 + " is not a palindrome");
      }
   }

      //EXAMPLE 5: Queue Demo
 
   public static void QueueDemo() {
 
      System.out.println("\nQUEUE EXAMPLE");    
      ArrayList<String> nameList = new ArrayList<>(Arrays.asList("Bugs","Wiley","Yosemite","Mickey","Charlie"));

      //create the queue
      MyQueue<String> qList = new MyQueue<>();

      //add the names to the queue
      for (String s : nameList){
         qList.enqueue(s);
      }

      //serve the first 2 people in the queue
      System.out.println("next served: " + qList.dequeue());
      System.out.println("next served: " + qList.dequeue());

      //print the next person in line 
            System.out.println("next in line: " + qList.peek());

  
   }

}
