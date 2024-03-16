package com.tasklist.system.domain.user;

import com.tasklist.system.domain.enums.Role;
import com.tasklist.system.domain.task.Task;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class User {

    private Long id;
    private String name;
    private String username;
    private String password;
    private String passwordConfirmation;
    Set<Role> roles;
    List<Task> tasks;
}
