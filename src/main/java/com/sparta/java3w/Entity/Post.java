package com.sparta.java3w.Entity;

import com.sparta.java3w.Dto.PostUpdateDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Post extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @Column(nullable = false)
    private String auther;

    @Column(nullable = false)
    private String pword;


    public Post(String title, String contents, String auther, String pword) {
        this.title = title;
        this.contents = contents;
        this.auther = auther;
        this.pword = pword;
    }

    public Post(PostUpdateDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.auther = requestDto.getAuther();
        this.pword = requestDto.getPword();
    }

    public void update(PostUpdateDto requestDto) {
        this.title = requestDto.getTitle();
        this.contents = requestDto.getContents();
        this.auther = requestDto.getAuther();
        this.pword = requestDto.getPword();
    }
}
