package com.innercircle.tredibackend.domain.recommend;

import com.innercircle.tredibackend.domain.recommend.command.KeywordCommand;
import com.innercircle.tredibackend.domain.recommend.command.KeywordsCommand;
import com.innercircle.tredibackend.domain.recommend.dto.FavoriteDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendService {

    private final RecommendRepository recommendRepository;
    private final WebClient webClient;

    @Transactional
    public Task sendKeyword(KeywordCommand.Create command) {
        // task 정보 저장
        Task task = recommendRepository.saveTask().orElseThrow();

        // webclint 를 통해서 python 서버로 전달
        Mono<String> result = webClient.post()
                .uri("/keyword")
                .bodyValue(new KeywordCommand.Create(command.keyword(), task.getTaskId()))
                .retrieve()
                .bodyToMono(String.class);

        result.subscribe();

        return task;
    }

    @Transactional
    public Task sendKeywords(KeywordsCommand.Create command) {
        // task 정보 저장
        Task task = recommendRepository.saveTask().orElseThrow();

        // webclint 를 통해서 python 서버로 전달
        Mono<String> result = webClient.post()
                .uri("/keywords")
                .bodyValue(new KeywordsCommand.Create(command.keywords(), task.getTaskId()))
                .retrieve()
                .bodyToMono(String.class);

        result.subscribe();

        return task;
    }


    @Transactional(readOnly = true)
    public Task getTaskStatus(Long taskId) {
        return recommendRepository.getTask(taskId).orElseThrow();
    }

    @Transactional(readOnly = true)
    public List<Result> getResult(Long taskId) {
        return recommendRepository.getResult(taskId);
    }

    public FavoriteDto getPopular() {
        return webClient.get()
                .uri("/popular")
                .retrieve()
                .bodyToMono(FavoriteDto.class)
                .block();
    }

}
