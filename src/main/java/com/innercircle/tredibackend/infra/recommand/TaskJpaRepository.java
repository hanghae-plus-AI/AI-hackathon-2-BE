package com.innercircle.tredibackend.infra.recommand;

import com.innercircle.tredibackend.domain.recommend.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskJpaRepository extends JpaRepository<Task, Long> {
}