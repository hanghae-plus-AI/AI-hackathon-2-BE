package com.innercircle.tredibackend.interfaces.controller.recommand.dto;

import com.innercircle.tredibackend.domain.recommend.dto.FavoriteDto;
import lombok.Builder;

public class PopularDto {

    @Builder(toBuilder = true)
    public record Response(int rank, String url,
                           String title, String summary, String thumbnail) {

        public static PopularDto.Response of(FavoriteDto.Favorite favorite) {

            return PopularDto.Response.builder()
                    .rank(favorite.rank())
                    .url(favorite.url())
                    .title(favorite.title())
                    .summary(favorite.summary())
                    .thumbnail(favorite.thumbnail())
                    .build();

        }
    }
}
