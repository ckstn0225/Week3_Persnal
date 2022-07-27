package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostViewRequestDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostAllGetService {

    private final PostRepository postRepository;
    //    글 상세조회에서 사용되는 부분     [GET  api/posts/{id}]
    @Transactional
    public PostViewRequestDto seeContents(Long id) {
        Post post1 = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다."));
        return new PostViewRequestDto(post1.getTitle(), post1.getContents(), post1.getAuther(),post1.getCreatedAt());
    }
}
