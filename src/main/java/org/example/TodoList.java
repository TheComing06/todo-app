package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoList {
    private final List<TaskChecker> items = new ArrayList<>();

    public void add(String item) {
        if (item != null) {
            item = item.trim();
            if (!item.isEmpty()) {
                items.add(new TaskChecker(item));
            }
        }
    }

    public boolean remove(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            return true;
        }
        return false;
    }

    public List<TaskChecker> getAll() {
        return new ArrayList<>(items);
    }

    public int size() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public boolean done(int index) {
        if (index >= 0 && index < items.size()) {
            TaskChecker task = items.get(index);
            task.isDone = !task.isDone;
            return true;
        }
        return false;
    }

    public String search(String text) {
        for (TaskChecker task1 : items) {
            if (task1.task.contains(text)) {
                return task1.toString();
            }
        }
        return null;
    }
}
