package com.sparta.java3w.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PostPwordDto {
    // 비밀번호 비교용
    private String pword;

    public PostPwordDto(String pword) {

        this.pword = pword;
    }
}
