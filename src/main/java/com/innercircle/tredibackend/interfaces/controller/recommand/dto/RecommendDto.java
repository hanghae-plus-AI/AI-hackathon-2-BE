package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class RecommendDto {

    public record Request(@NotBlank List<String> kewords) {
    }
}
