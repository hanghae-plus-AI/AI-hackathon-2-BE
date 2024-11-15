package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import com.innercircle.tredibackend.domain.recommend.Task;
import lombok.Builder;

public class TaskDto {

    @Builder(toBuilder = true)
    public record Response(
            Long taskId,
            Task.TaskStatus status
    ) {

        public static TaskDto.Response of(Task task) {
            return Response.builder()
                    .taskId(task.getTaskId())
                    .status(task.getStatus())
                    .build();
        }
    }
}
