package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostPwordDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
public class PostPwordService {
    private final PostRepository postRepository;
    //    비밀번호 매칭에서 사용 Post [api/posts/{i}
    public boolean PMatching(Long id, PostPwordDto pwordDto) {
        Post post1 = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        return Objects.equals(pwordDto.getPword(), post1.getPword());
    }


}
