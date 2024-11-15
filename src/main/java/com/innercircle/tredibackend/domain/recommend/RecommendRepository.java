package com.innercircle.tredibackend.domain.recommend;

import java.util.List;
import java.util.Optional;

public interface RecommendRepository {
    List<Result> getResult(Long taskId);

    Optional<Task> saveTask();

    Optional<Task> getTask(Long taskId);
}
