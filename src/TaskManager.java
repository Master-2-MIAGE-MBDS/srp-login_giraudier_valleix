import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    // Ajouter une nouvelle tâche
    public void addTask(String title, String description) {
        tasks.add(new Task(title, description));
    }

    // Marquer une tâche comme terminée
    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(true);
        }
    }

    public List<Task> getTasks() {
        return Collections.unmodifiableList(tasks);
    }
}