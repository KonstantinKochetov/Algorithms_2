package algoEX03.stack;

public class Stack<T> implements Stackable<T> {

    private Node head;
    private int counter = 0;

    /**
     * Class that represents the element of the stack
     */
    private class Node {
        T data;
        Node next;

        Node() {
        }

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * Pushes element to the stack
     * @param data  Element
     */
    @Override
    public void push(T data) {
        Node memorizedNode = head;
        head = new Node();
        head.data = data;
        head.next = memorizedNode;
        counter++;
    }

    /**
     * Pops the element from the stack
     * @return      Popped elemet
     */
    @Override
    public T pop() {
        if (head == null) {
            return null;
        }
        T retObj = head.data;
        head = head.next;
        counter--;
        return retObj;
    }

    /**
     * Gets the size of the stack
     * @return      Size of the stack
     */
    @Override
    public int size() {
        return counter;
    }

    /**
     * Clears the stack
     */
    @Override
    public void clear() {
        head = null;
        counter = 0;
    }

    /**
     * Checks if stack is empty
     * @return  True or false
     */
    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Prints all elements
     */
    @Override
    public void printAll() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    /**
     * Adds element to the stack
     * @param element  Element to add
     */
    @Override
    public void add(T element) {
        head = new Node(element, head);
        counter++;
    }

    /**
     * Deletes element by given index
     * @param index     index of the element
     */
    @Override
    public void deleteByIndex(int index) throws RuntimeException {
        T t = this.get(index);
        this.deleteByKey(t);
    }

    /**
     * Deletes element by giving this element as a parameter
     * @param key           Element to delete
     */
    @Override
    public void deleteByKey(T key) throws RuntimeException {
        if (head == null) throw new RuntimeException("cannot deleteByKey");
        if (head.data.equals(key)) {
            head = head.next;
            counter--;
            return;
        }
        Node cur = head;
        Node prev = null;
        while (cur != null && !cur.data.equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == null) {
            throw new RuntimeException("no findings");
        }
        prev.next = cur.next;
        counter--;
    }

    /**
     * Returns the element of the stack
     * @param index    Index of the element in the stack
     * @return         The element of the stack
     */
    @Override
    public T get(int index) throws IndexOutOfBoundsException {
        if (index >= this.size() || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (head == null) {
            throw new NoSuchFieldError();
        } else {
            int counter = 0;
            Node tmp = head;
            while (tmp.next != null) {
                if (counter == index) {
                    return tmp.data;
                }
                tmp = tmp.next;
                ++counter;
            }
            return tmp.data;
        }
    }

    /**
     * Prints size of the stack to the standard output
     */
    @Override
    public void printSize() {
        System.out.println(counter);
    }
}
