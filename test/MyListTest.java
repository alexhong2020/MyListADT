import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    MyList<String> lst;

    @BeforeEach
    void setUp() {
        lst = new MyList<>();
    }

    @AfterEach
    void tearDown() {
        lst = null;
    }

    @Test
    void size0() {
        assertEquals(0, lst.size());
    }

    @Test
    void addsize1() {
        lst.add("One");
        lst.add("Two");
        assertEquals(2, lst.size());
    }

    @Test
    void isEmpty() {
        assertEquals(true, lst.isEmpty());
    }

    @Test
    void add() {

    }

    @Test
    void ins0() {
        lst.add(0, "One");
        assertFalse(lst.isEmpty());
        assertEquals(1, lst.size());
        assertTrue(lst.get(0).equals("One"));
    }

    @Test
    void insNegIndex() {
        Exception ex = assertThrows(IndexOutOfBoundsException.class, () -> {
            lst.add(-2, "item to be added");
        });
    }

    @Test
    void insOutOfBound() {
        lst.add("one");
        lst.add("two");
        lst.add("three");
        lst.add("four");
        lst.add("five");
        Exception ex = assertThrows(IndexOutOfBoundsException.class, () -> {
            lst.add(6, "item to be added");
        });
    }

    @Test
    void get() {
        lst.add("One");
        lst.add("Two");
        assertEquals("Two", lst.get(1));
    }

    @Test
    void set() {

        assertEquals("Two", lst.set(1, "Two"));
        assertEquals("Two", lst.get(1));
    }

    @Test
    void remove() {
        lst.add("One");
        lst.add("Two");
        lst.add("Three");
        lst.add("Four");
        lst.remove(1);
        assertEquals("Three", lst.get(1));
    }
}