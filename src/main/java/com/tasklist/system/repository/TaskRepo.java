package com.tasklist.system.repository;

import com.tasklist.system.domain.task.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepo {
    Optional<Task> findById(Long id);
    List<Task> findAllByUserId(Long userId);
    void assignToUserById(Long taskId, Long userId);
    void update(Task task);
    void create(Task task);
    void delete(Long id);
}
