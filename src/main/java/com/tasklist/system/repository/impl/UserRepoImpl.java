package com.tasklist.system.repository.impl;

import com.tasklist.system.domain.enums.Role;
import com.tasklist.system.domain.user.User;
import com.tasklist.system.repository.UserRepo;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class UserRepoImpl implements UserRepo {
    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return Optional.empty();
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void create(User user) {

    }

    @Override
    public void insertUserRole(Long userId, Role role) {

    }

    @Override
    public boolean isTaskOwner(Long userId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
