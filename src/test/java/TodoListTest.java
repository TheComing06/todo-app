import org.example.TodoList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TodoListTest {

    @Test
    void addAndList() {
        TodoList t = new TodoList();
        t.add(" task1 ");
        assertEquals(1, t.size());
        assertEquals("task1 [ ]", t.getAll().getFirst().toString());
    }

    @Test
    void remove() {
        TodoList t = new TodoList();
        t.add("a");
        t.add("b");
        assertTrue(t.remove(0));
        assertEquals(1, t.size());
        assertFalse(t.remove(10));
    }

    @Test
    void addEmptyIgnored() {
        TodoList t = new TodoList();
        t.add("    ");
        assertEquals(0, t.size());
    }

    @Test
    void clear() {
        TodoList t = new TodoList();
        t.add("abs");
        t.add("123");
        t.clear();
        assertEquals(0, t.size());
    }

    @Test
    void done() {
        TodoList t = new TodoList();
        t.add("abs");
        assertTrue(t.done(0));
    }

    @Test
    void search() {
        TodoList t = new TodoList();
        t.add("abs");
        assertEquals("abs [ ]", t.search("a"));
    }
}
