public class MyStack<E> {

    private final MyLinkedList<E> myStack = new MyLinkedList<>();

    public void push(E item) { myStack.addFirst(item); }
    public E pop() { return myStack.removeFirst(); }
    public E peek() { return myStack.peek(); }
    public int size() { return myStack.size(); }

    public boolean isEmpty() { return myStack.size() == 0; }
    public String toString() {return myStack.toString();}

    public void clear() {
        while (!isEmpty())
           pop();
    }
}
