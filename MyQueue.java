public class MyQueue<E> {

    private final MyLinkedList<E> myQueue = new MyLinkedList<>();

    public void enqueue(E item) { myQueue.addLast(item); }
    public E dequeue() { return myQueue.removeFirst(); }
    public E peek() { return myQueue.peek(); }
    public int size() { return myQueue.size(); }

    public boolean isEmpty() { return myQueue.size() == 0; }
    public String toString() {return myQueue.toString();}
}
