package com.innercircle.tredibackend.domain.recommend;

import com.innercircle.tredibackend.interfaces.controller.recommand.dto.KeywordDto;
import com.innercircle.tredibackend.interfaces.controller.recommand.dto.KeywordsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecommendService {

    private final TaskRepository taskRepository;
    private final ResultRepository resultRepository;

    public String sendKeyword(KeywordDto.Request request) {
        return "";
    }

    public String sendKeywords(KeywordsDto.Request request) {
        return "";
    }


    public String getTaskStatus(Long taskId) {
        return "";
    }

    public String getResult(Long taskId) {
        return "";
    }


    public String getPopular() {
        return "";
    }
}
