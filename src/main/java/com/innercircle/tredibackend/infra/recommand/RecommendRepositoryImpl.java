package com.innercircle.tredibackend.infra.recommand;

import com.innercircle.tredibackend.domain.recommend.RecommendRepository;
import com.innercircle.tredibackend.domain.recommend.Result;
import com.innercircle.tredibackend.domain.recommend.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RecommendRepositoryImpl implements RecommendRepository {

    private final ResultJpaRepository resultJpaRepository;
    private final TaskJpaRepository taskJpaRepository;

    @Override
    public Optional<Task> saveTask() {
        Task task = taskJpaRepository.save(Task.builder().status(Task.TaskStatus.PENDING).build());
        return Optional.of(task);
    }

    @Override
    public Optional<Task> getTask(Long taskId) {
        return taskJpaRepository.findById(taskId);
    }

    @Override
    public List<Result> getResult(Long taskId) {
        return resultJpaRepository.findAllByTaskId(taskId);
    }


}
