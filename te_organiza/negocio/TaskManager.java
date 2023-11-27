package te_organiza.negocio;

import java.util.ArrayList;
import java.util.List;


import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    // Atributo para armazenar a lista de usuários
    private List<User> userList;

    // Construtor
    public TaskManager() {
        this.userList = new ArrayList<>();
    }

    // Método para adicionar um usuário à lista
    public void addUser(User user) {
        userList.add(user);
    }

    // Método para imprimir a lista de usuários
    public void printUserList() {
        System.out.println("User List:");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        TaskManager taskManager = new TaskManager();

        // Adiciona usuários à lista
        User user1 = new User("John Doe");
        User user2 = new User("Jane Smith");

        taskManager.addUser(user1);
        taskManager.addUser(user2);

        // Imprime a lista de usuários
        taskManager.printUserList();
    }
}

class User {
    // Atributo para armazenar o nome do usuário
    private String username;

    // Construtor
    public User(String username) {
        this.username = username;
    }

    // Método getter para obter o nome do usuário
    public String getUsername() {
        return username;
    }

    // Método toString para imprimir o nome do usuário
    @Override
    public String toString() {
        return "User: " + username;
    }
}