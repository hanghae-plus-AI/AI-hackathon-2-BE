package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import com.innercircle.tredibackend.domain.recommend.command.KeywordCommand;
import jakarta.validation.constraints.NotBlank;

public class KeywordDto {
    public record Request(@NotBlank String keyword) {
        public KeywordCommand.Create toCreateCommand() {
            return KeywordCommand.Create.builder().keyword(keyword).build();
        }
    }
}
