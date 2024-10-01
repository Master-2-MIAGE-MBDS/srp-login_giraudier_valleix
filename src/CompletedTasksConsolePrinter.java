import java.util.List;

public class CompletedTasksConsolePrinter implements ITasksPrinter {

    private List<Task> tasks;

    public CompletedTasksConsolePrinter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void print() {
        System.out.println("Liste des tâches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
