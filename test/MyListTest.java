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