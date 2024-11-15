package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class KeywordsDto {
    public record Request(@NotBlank List<String> keywords) {}
}
