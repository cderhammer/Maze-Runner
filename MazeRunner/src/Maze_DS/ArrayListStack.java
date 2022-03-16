/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import DataStructures.StackADT;
import java.util.ArrayList;

/**
 * ArrayListStack implementation
 *
 * @author cderh
 * @param <T>
 */
public class ArrayListStack<T> implements StackADT<T> {

    private ArrayList<T> myList;
    private int numElements;

    /**
     * Constructor for ArrayListStack()
     */
    public ArrayListStack() {
        numElements = 0;
        myList = new ArrayList<T>();
    }

    /**
     * Pushes an element onto a stack
     *
     * @param element
     */
    @Override
    public void push(T element) {
        myList.add(element);
        numElements++;
    }

    /**
     * Pops and element off of a stack
     *
     * @return result
     * @throws EmptyCollectionException
     */
    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack is empty");
        }
        T result = myList.remove(size() - 1);
        numElements--;
        return result;
    }

    /**
     * Peek at the element on top of the stack
     *
     * @return myList
     * @throws EmptyCollectionException
     */
    @Override
    public T peek() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }
        return myList.get(size() - 1);
    }

    /**
     * Checks if the stack is empty
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        if (numElements == 0) {
            return true;
        }
        return false;
    }

    /**
     * Displays the size of a stack
     *
     * @return numElements
     */
    @Override
    public int size() {
        return numElements;
    }

    /**
     * displays
     *
     * @return
     */
    @Override
    public String toString() {
        return "ArrayListStack{" + "myList=" + myList + ", numElements=" + numElements + '}';
    }

}
