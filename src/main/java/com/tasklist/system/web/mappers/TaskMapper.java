package com.tasklist.system.web.mappers;

import com.tasklist.system.domain.task.Task;
import com.tasklist.system.web.dto.task.TaskDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    TaskDto toDto(Task task);
    List<TaskDto> toDto(List<Task> tasks);
    Task toEntity(TaskDto dto);

}
