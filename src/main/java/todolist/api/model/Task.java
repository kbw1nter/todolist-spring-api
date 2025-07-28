package todolist.api.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private String id;
    private String description;
    private boolean completed;
    private LocalDateTime createdAt;

    public Task(String description) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.completed = false;
        this.createdAt = LocalDateTime.now();
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

