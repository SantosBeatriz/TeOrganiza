package te_organiza.negocio.beans;

import java.util.ArrayList;
import java.util.List;

import te_organiza.negocio.User;

public class TaskManager {
    private List<User> userList;

    public TaskManager() {
        this.userList = new ArrayList<>();
    }

    // Getter para userList (encapsulamento)
    public List<User> getUserList() {
        return userList;
    }

    // Método para adicionar um usuário à lista
    public void addUser(User user) {
        userList.add(user);
    }

    // Método para imprimir a lista de usuários
    public void printUserList() {
        System.out.println("User List:");
        System.out.println(userList);
    }

}
