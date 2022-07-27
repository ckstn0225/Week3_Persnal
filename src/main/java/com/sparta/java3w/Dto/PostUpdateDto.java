package com.sparta.java3w.Dto;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostUpdateDto {
    //    글 업데이트
    private String title;
    private String contents;
    private String auther;
    private String pword;

    public PostUpdateDto(String title, String contents, String auther, String pword) {
        this.title = title;
        this.contents = contents;
        this.auther = auther;
        this.pword = pword;
    }
}
