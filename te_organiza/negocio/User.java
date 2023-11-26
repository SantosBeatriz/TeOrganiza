package te_organiza.negocio;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String username;
    private String password;
    private List<Task> tasks;

    // Construtor
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    // Getters e setters
   
    
}