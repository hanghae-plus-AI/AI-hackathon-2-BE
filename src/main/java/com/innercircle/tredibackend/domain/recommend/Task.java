package com.innercircle.tredibackend.domain.recommend;

import com.innercircle.tredibackend.domain.recommend.common.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "task")
public class Task extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId; // task ID

    @Enumerated(EnumType.STRING)
    private TaskStatus status; // task 상태

    public enum TaskStatus {
        PENDING,
        COMPLETE
    }

}
