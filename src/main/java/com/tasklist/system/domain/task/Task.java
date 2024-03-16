package com.tasklist.system.domain.task;

import com.tasklist.system.domain.enums.TaskStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Task {

    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private LocalDateTime expirationDate;
}
