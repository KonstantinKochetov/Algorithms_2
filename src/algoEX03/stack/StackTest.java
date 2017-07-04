package algoEX03.stack;

import algoEX03.data.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StackTest {
    Stackable<Student> firstList;
    Student s1;
    Student s2;
    Student s3;
    Student s4;

    @org.junit.Before
    public void setUp() throws Exception {
        firstList = new Stack<>();
        s1 = new Student("Konstantin", "Kochetov", 1, 10);
        s2 = new Student("Barrack", "Obama", 2, 9);
        s3 = new Student("Donald", "Trump", 3, 8);
        s4 = new Student("Vladimir", "Putin", 4, 7);
        firstList.push(s1);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        firstList.clear();
    }

    @org.junit.Test
    public void push() throws Exception {
        firstList.push(s2);
        assertEquals(firstList.size(), 2);
    }

    @org.junit.Test
    public void pop() throws Exception {
        firstList.pop();
        assertEquals(firstList.size(), 0);
    }


    @org.junit.Test
    public void printAll() throws Exception {
        firstList.printAll();
    }

    @org.junit.Test
    public void add() throws Exception {
        firstList.add(s2);
        assertEquals(firstList.size(), 2);
    }

    @org.junit.Test
    public void deleteByIndex() throws Exception {
        firstList.deleteByIndex(0);
        assertEquals(firstList.size(), 0);
    }

    @org.junit.Test
    public void deleteByKey() throws Exception {
        firstList.deleteByKey(s1);
        assertEquals(firstList.size(), 0);
    }


    @org.junit.Test
    public void printSize() throws Exception {
        firstList.printSize();
    }

}