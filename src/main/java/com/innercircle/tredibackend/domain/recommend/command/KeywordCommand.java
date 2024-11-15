package com.innercircle.tredibackend.domain.recommend.command;

import lombok.Builder;

public class KeywordCommand {

    @Builder(toBuilder = true)
    public record Create(
            String keyword,
            Long taskId
    ) {
    }


}
