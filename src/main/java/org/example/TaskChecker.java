package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskChecker {
    public final String task;
    public boolean isDone = false;

    public TaskChecker(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return task + (isDone ? " [Done]" : " [ ]");
    }
}
