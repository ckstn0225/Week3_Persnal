package com.sparta.java3w.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class PostViewRequestDto {
    //    글 상세 조회
    private String title;
    private String contents;
    private String auther;
    private LocalDateTime createdAt;

    public PostViewRequestDto(String title, String contents, String auther, LocalDateTime createdAt) {
        this.title = title;
        this.contents = contents;
        this.auther = auther;
        this.createdAt = createdAt;
    }

}
