package com.innercircle.tredibackend.infra.recommand;

import com.innercircle.tredibackend.domain.recommend.Result;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResultJpaRepository extends JpaRepository<Result, Long> {

    List<Result> findAllByTaskId(Long taskId);

}
