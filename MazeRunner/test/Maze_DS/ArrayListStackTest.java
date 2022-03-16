/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze_DS;

import DataStructures.EmptyCollectionException;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cderh
 */
public class ArrayListStackTest {

    //ArrayListStack<String> testStack = new ArrayListStack<>();
    public ArrayListStackTest() {
    }

    /**
     * Test of push method, of class ArrayListStack
     */
    @Test
    public void testPush() {
        try {
            System.out.println("push");
            Object element = null;
            Object element2 = null;
            Object element3 = null;
            Object element4 = null;
            ArrayListStack instance = new ArrayListStack();
            instance.push(element);
            assertEquals(false, instance.isEmpty());
            instance.push(element2);
            instance.push(element3);
            instance.push(element4);
            instance.peek();
            assertTrue("element", true);
            instance.pop();
            assertEquals(false, instance.isEmpty());
            assertTrue(instance.size() == 3);
        } catch (Exception e) {
            assertTrue(e instanceof EmptyCollectionException);
        }
    }

    /**
     * Test of pop method, of class ArrayListStack.
     */
    @Test
    public void testPop() {
        try {
            System.out.println("pop");
            ArrayListStack instance = new ArrayListStack();
            Object element = null;
            Object element2 = null;
            Object element3 = null;
            Object result = instance.pop();
            assertEquals(element, result);
            instance.push(element);
            instance.push(element2);
            instance.push(element3);
            assertEquals(false, instance.isEmpty());
            instance.pop();
            assertTrue(instance.size() == 2);
            instance.pop();
            instance.pop();
            assertEquals(true, instance.isEmpty());
        } catch (EmptyCollectionException ece) {
            assertTrue(ece instanceof EmptyCollectionException);
        }
    }

    /**
     * Test of peek method, of class ArrayListStack.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        ArrayListStack instance = new ArrayListStack();
        Object element = null;
        Object element2 = null;
        try {
            Object result = instance.peek();
            assertEquals(element, result);

        } catch (EmptyCollectionException ece) {
            System.out.println("Empty");
        }
        try {
            instance.push(element);
            instance.push(element2);
            Object temp = instance.peek();
            assertEquals(temp, element2);
        } catch (EmptyCollectionException ece) {
            System.out.println("Empty");
        }
    }

    /**
     * Test of isEmpty method, of class ArrayListStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ArrayListStack instance = new ArrayListStack();
        ArrayList<String> element = new ArrayList<>();
        assertTrue(instance.isEmpty());
        instance.push(element);
        assertFalse(instance.isEmpty());
        try {
            instance.pop();
        } catch (EmptyCollectionException ece) {
            System.out.println("Empty");
        }
        assertTrue(instance.isEmpty());

    }

    /**
     * Test of size method, of class ArrayListStack.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Object element = null;
        Object element2 = null;
        Object element3 = null;
        ArrayListStack instance = new ArrayListStack();
        assertTrue(0 == instance.size());
        instance.push(element);
        assertTrue(1 == instance.size());
        instance.push(element2);
        assertTrue(2 == instance.size());
        instance.push(element3);
        assertTrue(3 == instance.size());

    }

}
