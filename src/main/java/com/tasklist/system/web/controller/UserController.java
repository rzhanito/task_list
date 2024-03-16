package com.tasklist.system.web.controller;

import com.tasklist.system.domain.task.Task;
import com.tasklist.system.domain.user.User;
import com.tasklist.system.service.TaskService;
import com.tasklist.system.service.UserService;
import com.tasklist.system.web.dto.task.TaskDto;
import com.tasklist.system.web.dto.user.UserDto;
import com.tasklist.system.web.dto.validation.OnCreate;
import com.tasklist.system.web.dto.validation.OnUpdate;
import com.tasklist.system.web.mappers.TaskMapper;
import com.tasklist.system.web.mappers.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("api/v1/users")
public class UserController {
    private final UserService userService;
    private final TaskService taskService;

    private final UserMapper userMapper;
    private final TaskMapper taskMapper;

    @PutMapping
    public ResponseEntity<UserDto> update(@Validated(OnUpdate.class) @RequestBody UserDto userDto){
        User user = userMapper.toEntity(userDto);
        User updatedUser = userService.update(user);
        return ResponseEntity.ok(userMapper.toDto(updatedUser));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable Long id){
        User user = userService.getById(id);
        return ResponseEntity.ok(userMapper.toDto(user));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        userService.delete(id);
        return ResponseEntity.ok("User deleted successfully.");
    }

    @GetMapping("/{id}/tasks")
    public ResponseEntity<List<TaskDto>> getAllTasksById(@PathVariable Long id){
        List<Task> tasks = taskService.getAllByUserId(id);
        return ResponseEntity.ok(taskMapper.toDto(tasks));
    }

    @PostMapping("/{id}/tasks")
    public ResponseEntity<TaskDto> createTask(@PathVariable(name = "id") Long userId, @Validated(OnCreate.class) @RequestBody TaskDto taskDto){
        Task task = taskMapper.toEntity(taskDto);
        Task createdTask = taskService.create(task, userId);
        return ResponseEntity.ok(taskMapper.toDto(createdTask));
    }
}
