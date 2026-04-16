  
public class MyLinkedList<E>{
    private Node<E> head, tail;
    private int size = 0;
    
    //Constructor: Create a list from an array of objects 
    public MyLinkedList() { }

    public int size() {return size;}
 
    //Add the element to the head of the list
    //PRE: accepts the element to add
    //POST:creates the new node
    //     adds the element as the new 'head' element
    //     adjusts tail if the list was empty
    //     increases the size of the list
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);  // Create a new node
        newNode.next = head;              // link the new node with the head
        head = newNode;                   // head points to the new node
        size++;                           // Increase list size

        if (tail == null)                 // the new node is the only node in list
           tail = head;
    }


    //Add an element to the end of the list
    //PRE: accepts the element to add
    //POST:creates the new node
    //     adds the element as the tail element
    //     adjusts head if the list was empty 
    //     increases the size of the list

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);  // Create a new for element e

        if (tail == null)  
           head = tail = newNode;       // The new node is the only node in list
        else {
            tail.next = newNode;        // Link the new with the last node
            tail = newNode;             // tail now points to the last node
        }
        size++;                           // Increase size
    }

    // Remove the head node and return the object
    //PRE:  None 
    //POST: Check if list is empty (return null if so)
    //      save head element, remove head value & adjust pointers
    //      return saved element 

    public E removeFirst() {
        if (size == 0) {
           return null;
        }
        else if (size == 1) {
            E temp = head.element;
            head = tail = null;
            size = 0;
            return temp;
        }
        else {
            E temp = head.element;
            head = head.next;
            size--;

            return temp;
        }
    }
 
    //PRE: none
    //POST:peek - return first element

    public E peek() {
        if (size == 0) 
           return null;
        
        return head.element; 
    }


    //Replace the element at the specified position with new element
    //PRE: accepts the index value & new element
    //POST:if the list is empty - return null
    //     if index is invalid - return null
    //     get to index value
    //     save current value, set new value
    //     return saved value

    public E set(int index, E e) {
        // Left as an exercise
        if (size == 0 || index < 0 || index > size) {
        return null;
        }
        Node<E> current = head;
        for (int i = 0; i < index; i++) 
            current = current.next;

        //replace current position with new data
        E currentValue = current.element;
        current.element = e;
        return currentValue;
    }

    //PRE: none
    //POST:creates a string with MyLinkedList values & returns string
    public String toString() {

        StringBuilder result = new StringBuilder("[");
        if (size == 0){
            result.append("]");
            return result.toString();
        }

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            }
            else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E element){
            this.element = element;
        }

    }
}