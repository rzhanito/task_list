package com.tasklist.system.repository;

import com.tasklist.system.domain.enums.Role;
import com.tasklist.system.domain.user.User;

import java.util.Optional;

public interface UserRepo {

    Optional<User> findById(Long id);
    Optional<User> findByUsername(String username);
    void update(User user);
    void create(User user);
    void insertUserRole(Long userId, Role role);
    boolean isTaskOwner(Long userId, Long taskId);
    void delete(Long id);
}
