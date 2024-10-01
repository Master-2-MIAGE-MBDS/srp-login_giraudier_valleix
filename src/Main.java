public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Tache 1", "Description de la tache 1");
        taskManager.addTask("Tache 2", "Description de la tache 2");
        taskManager.addTask("Tache 3", "Description de la tache 3");

        taskManager.markTaskAsComplete(1);

        PrinterConsole console = new PrinterConsole(taskManager.getTasks());

        console.print(PrintReportType.COMPLETED_TASKS);
        console.print(PrintReportType.PENDING_TASKS);
    }
}
