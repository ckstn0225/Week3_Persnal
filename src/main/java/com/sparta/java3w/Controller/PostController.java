package com.sparta.java3w.Controller;

import com.sparta.java3w.Dto.PostGetDto;
import com.sparta.java3w.Dto.PostPwordDto;
import com.sparta.java3w.Dto.PostUpdateDto;
import com.sparta.java3w.Dto.PostViewRequestDto;
import com.sparta.java3w.Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostController {

    private final PostUpdateService postUpdateService;
    private final PostGetService postGetService;
    private final PostPwordService postPwordService;
    private final PostAllGetService postAllGetService;
    private final PostWriteService postWriteService;
    private final PostDeleteService postDeleteService;

    // 글 전체 조회
    @GetMapping("/api/posts")
    public List<PostGetDto> getPostInfo() {
        return postGetService.onlytad();
    }

    //    글 상세 조회
    @GetMapping("/api/posts/{id}")
    public PostViewRequestDto getPostAll(@PathVariable Long id) {
        return postAllGetService.seeContents(id);
    }

    // 글 등록
    @PostMapping("/api/posts")
    public String createPost(@RequestBody PostUpdateDto requestDto) {
        return postWriteService.WritePost(requestDto);

    }

    //   비밀번호 비교
    @PostMapping("/api/posts/{id}")
    public boolean matchPword(@PathVariable Long id, @RequestBody PostPwordDto postPwordDto) {
        return postPwordService.PMatching(id, postPwordDto);
    }

    //    글 수정
    @PutMapping("/api/posts/{id}")
    public String updateCourse(@PathVariable Long id, @RequestBody PostUpdateDto requestDto) {
        return postUpdateService.update(id, requestDto);
    }

    //    글 삭제
    @DeleteMapping("/api/posts/{id}")
    public String deleteCourse(@PathVariable Long id) {
        return postDeleteService.DeletePost(id);
    }
}