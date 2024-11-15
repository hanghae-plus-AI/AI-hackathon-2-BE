package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class KeywordDto {
    public record Request(@NotBlank String keyword) {}
}
