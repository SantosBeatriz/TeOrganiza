package te_organiza.negocio;

import java.time.LocalDate;
import java.util.List;


public class TaskStatus {

    private int toDo;
    private int going;
    private int done;


    public TaskStatus(int toDo, int going, int done) {
        this.toDo = toDo;
        this.going = going;
        this.done = done;
    }


    public int getToDo() {
        return toDo;
    }

    public void setToDo(int toDo) {
        this.toDo = toDo;
    }

    public int getGoing() {
        return going;
    }

    public void setGoing(int going) {
        this.going = going;
    }

    public int getDone() {
        return done;
    }

    public void setDone(int done) {
        this.done = done;
    }


    public void printStatus() {
        System.out.println("To Do: " + toDo);
        System.out.println("Going: " + going);
        System.out.println("Done: " + done);
    }

    public static void main(String[] atatu) {
        // Exemplo de uso
        TaskStatus taskStatus = new TaskStatus(1, 2, 3);


        System.out.println("Estado Inicial:");
        taskStatus.printStatus();


        taskStatus.setToDo(1);
        taskStatus.setGoing(2);
        taskStatus.setDone(3);


        System.out.println("\nEstado Atualizado:");
        taskStatus.printStatus();
    }
}

