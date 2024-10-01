import java.util.List;

public class PrinterConsole implements IReportPrinter {

    private List<Task> tasks;

    public PrinterConsole(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void print(PrintReportType type) {
        switch (type) {
            case COMPLETED_TASKS:
                printCompletedTasks();
                break;
            case PENDING_TASKS:
                printPendingTasks();
                break;
            default:
                throw new RuntimeException("Type de rapport inconnu");
        }

    }

    private void printCompletedTasks() {
        System.out.println("Liste des tâches terminees :");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }
        }
    }

    private void printPendingTasks() {
        System.out.println("Liste des tâches non terminees :");
        for (Task task : tasks) {
            if (!task.isCompleted()) {
                System.out.println(task);
            }
        }
    }
}
