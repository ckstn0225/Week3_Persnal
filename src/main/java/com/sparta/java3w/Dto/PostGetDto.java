package com.sparta.java3w.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostGetDto {
    //    글 전체 조회
    private String title;
    private String auther;
    private LocalDateTime createdAt;

    public PostGetDto(String title, String auther, LocalDateTime createdAt) {
        this.title = title;
        this.auther = auther;
        this.createdAt = createdAt;
    }
}
