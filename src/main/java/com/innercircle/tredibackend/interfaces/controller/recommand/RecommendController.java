package com.innercircle.tredibackend.interfaces.controller.recommand;

import com.innercircle.tredibackend.domain.recommend.RecommendService;
import com.innercircle.tredibackend.interfaces.controller.common.dto.ApiResultResponse;
import com.innercircle.tredibackend.interfaces.controller.recommand.dto.KeywordDto;
import com.innercircle.tredibackend.interfaces.controller.recommand.dto.KeywordsDto;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/recommendations")
public class RecommendController {

    private final RecommendService recommendService;

    /**
     * 검색 키워드 전달
     *
     * @return ApiResultResponse 직접 입력 받은 검색어를 전달한다.
     */
    @PostMapping("/search")
    public ApiResultResponse<String> sendKeyword(@RequestBody KeywordDto.Request request) {
        return ApiResultResponse.ok(recommendService.sendKeyword(request));
    }

    /**
     * 선택 키워드 전달
     *
     * @return ApiResultResponse 정해진 키워드를 전달한다.
     */
    @PostMapping("/select")
    public ApiResultResponse<String> sendKeywords(@RequestBody KeywordsDto.Request request) {
        return ApiResultResponse.ok(recommendService.sendKeywords(request));
    }

    /**
     * 작업 상태 조회 (polling)
     *
     * @return ApiResultResponse 작업에 대한 상태를 조회한다.
     */
    @GetMapping("/{taskId}")
    public ApiResultResponse<String> getTaskStatus(@PathVariable(name = "taskId") @NotNull Long taskId) {
        return ApiResultResponse.ok(recommendService.getTaskStatus(taskId));
    }

    /**
     * 키워드 결과 조회
     *
     * @return ApiResultResponse 키워드에 대한 결과를 받는다.
     */
    @GetMapping("/result/{taskId}")
    public ApiResultResponse<String> getResult(@PathVariable(name = "taskId") @NotNull Long taskId) {
        return ApiResultResponse.ok(recommendService.getResult(taskId));
    }



    /**
     * 인기글 조회
     *
     * @return ApiResultResponse 키워드에 대한 결과를 받는다.
     */
    @GetMapping("/popular")
    public ApiResultResponse<String> getPopular() {
        return ApiResultResponse.ok(recommendService.getPopular());
    }


}
