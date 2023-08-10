package edu.sdccd.cisc191;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

/**
 * The Task class represents a task with a name, description, and date.
 * It provides methods to retrieve the task's details and overrides the `toString()` method to generate a formatted string representation of the object.
 * The class also implements the `Serializable` interface, enabling object serialization and deserialization.
 */
public class Task implements Serializable {
    private final String taskName;
    private final String taskDescription;
    private final LocalDate date;
    private Date dateCompleted;
    /**
     * Constructs a Task object with the specified task name, description, and date.
     *
     * @param taskName        the name of the task
     * @param taskDescription the description of the task
     * @param date            the date of the task
     */

    public Task(String taskName, String taskDescription, LocalDate date) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.date = date;
    }

    public String getTaskDescription() {
        return taskDescription;
    }
    public String getTaskName() {
        return taskName;
    }
    public LocalDate getDate() {
        return date;
    }

    public Date getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(Date dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    @Override
    public String toString() {
        return "Task: " + taskName
                + "  Description: " + taskDescription
                + "  Date: " + date;
    }
}
