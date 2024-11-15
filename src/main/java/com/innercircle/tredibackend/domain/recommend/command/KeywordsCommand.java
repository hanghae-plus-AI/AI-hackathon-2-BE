package com.innercircle.tredibackend.domain.recommend.command;

import lombok.Builder;

import java.util.List;

public class KeywordsCommand {

    @Builder(toBuilder = true)
    public record Create(
            List<String> keywords,
            Long taskId
    ) {
    }
}
