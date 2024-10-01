import java.util.List;

public class PendingsTasksConsolePrinter implements ITasksPrinter {

    private List<Task> tasks;

    public PendingsTasksConsolePrinter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void print() {
        System.out.println("Liste des tâches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
