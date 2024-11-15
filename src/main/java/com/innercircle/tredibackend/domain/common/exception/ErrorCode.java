package com.innercircle.tredibackend.domain.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ErrorCode {

    // kafka 관련
    KAFKA_PUBLISH_FAILED("kafka 메시지 발행에 실패하였습니다");


    private final String msg;
}
