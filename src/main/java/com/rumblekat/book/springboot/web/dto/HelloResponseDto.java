package com.rumblekat.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/* 모든 응답은 DTO */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
