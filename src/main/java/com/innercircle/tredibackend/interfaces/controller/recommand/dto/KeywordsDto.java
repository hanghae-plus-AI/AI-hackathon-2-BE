package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import com.innercircle.tredibackend.domain.recommend.command.KeywordsCommand;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class KeywordsDto {
    public record Request(@NotBlank List<String> keywords) {
        public KeywordsCommand.Create toCreateCommand() {
            return KeywordsCommand.Create.builder().keywords(keywords).build();
        }

    }
}
