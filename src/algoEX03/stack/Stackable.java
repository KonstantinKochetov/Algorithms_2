package algoEX03.stack;

public interface Stackable<T> {

    /**
     * Pushes element to the stack
     * @param data  Element
     */
    void push(T data);

    /**
     * Pops the element from the stack
     * @return      Popped elemet
     */
    T pop();

    /**
     * Gets the size of the stack
     * @return      Size of the stack
     */
    int size();

    /**
     * Clears the stack
     */
    void clear();

    /**
     * Checks if stack is empty
     * @return  True or false
     */
    boolean isEmpty();

    /**
     * Prints all elements
     */
    void printAll();

    /**
     * Adds element to the stack
     * @param element  Element to add
     */
    void add(T element);

    /**
     * Deletes element by given index
     * @param index     index of the element
     */
    void deleteByIndex(int index);

    /**
     * Deletes element by giving this element as a parameter
     * @param key           Element to delete
     */
    void deleteByKey(T key);

    /**
     * Returns the element of the stack
     * @param index    Index of the element in the stack
     * @return         The element of the stack
     */
    T get(int index) throws IndexOutOfBoundsException;


    /**
     * Prints size of the stack to the standard output
     */
    void printSize();
}
