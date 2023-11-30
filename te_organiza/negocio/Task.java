package te_organiza.negocio;

import java.time.LocalDate;

import te_organiza.negocio.beans.TaskPriority;
import te_organiza.negocio.beans.TaskStatus;

public class Task {
    private int id;
    private String description;
    private LocalDate startDate;
    private LocalDate dueDate;
    private TaskStatus status;
    private String category;
    private TaskPriority priority;

    // Construtor
    public Task(int id, String description, LocalDate startDate, LocalDate dueDate, TaskStatus status, String category, TaskPriority priority) {
        this.id = id;
        this.description = description;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.status = status;
        this.category = category;
        this.priority = priority;
    }

// Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    
    

} 
