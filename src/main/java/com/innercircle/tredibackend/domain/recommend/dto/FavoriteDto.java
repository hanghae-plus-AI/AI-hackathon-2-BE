package com.innercircle.tredibackend.domain.recommend.dto;

import java.util.List;

public record FavoriteDto(
        List<Favorite> favorites
) {
    public record Favorite(int rank,
                           String url,
                           String title,
                           String thumbnail,
                           String summary) {

    }

}
