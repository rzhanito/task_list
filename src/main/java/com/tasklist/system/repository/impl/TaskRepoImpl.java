package com.tasklist.system.repository.impl;

import com.tasklist.system.domain.task.Task;
import com.tasklist.system.repository.TaskRepo;

import java.util.List;
import java.util.Optional;

public class TaskRepoImpl implements TaskRepo {

    @Override
    public Optional<Task> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Task> findAllByUserId(Long userId) {
        return null;
    }

    @Override
    public void assignToUserById(Long taskId, Long userId) {

    }

    @Override
    public void update(Task task) {

    }

    @Override
    public void create(Task task) {

    }

    @Override
    public void delete(Long id) {

    }
}
