package com.innercircle.tredibackend.domain.recommend;

import com.innercircle.tredibackend.domain.recommend.common.model.BaseTimeEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "results")
public class Result extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultId; // task ID

    private Long taskId;

    private String url;

    private String title;

    private String summary;

    private String thumbnail;
}
