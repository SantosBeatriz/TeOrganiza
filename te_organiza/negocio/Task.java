package te_organiza.negocio;

import java.time.LocalDate;
import java.util.List;

public public class Task {
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
    

} 
