package com.sparta.java3w.Dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class PostUpdateDto {
    //    글 업데이트
    private String title;
    private String contents;
    private String auther;
    private String pword;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    public PostUpdateDto(String title, String contents, String auther, String pword, LocalDateTime modifiedAt) {
        this.title = title;
        this.contents = contents;
        this.auther = auther;
        this.pword = pword;
        this.modifiedAt = modifiedAt;
    }
}
