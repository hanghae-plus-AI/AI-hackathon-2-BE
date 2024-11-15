package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import com.innercircle.tredibackend.domain.recommend.Result;
import lombok.Builder;

public class ResultDto {

    @Builder(toBuilder = true)
    public record Response(Long resultId, String url,
                           String title, String summary, String thumbnail) {

        public static ResultDto.Response of(Result result) {

            return Response.builder()
                    .resultId(result.getResultId())
                    .url(result.getUrl())
                    .title(result.getTitle())
                    .summary(result.getSummary())
                    .thumbnail(result.getThumbnail())
                    .build();

        }
    }
}
