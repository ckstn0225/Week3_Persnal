package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostUpdateDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostUpdateService {
    private final PostRepository postRepository;

    //    Update에서 사용 [PUT api/posts/{id}]
    @Transactional
    public String update(Long id, PostUpdateDto updateDto) {
        Post post1 = postRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        post1.update(updateDto);
        return "ID: ["+post1.getId()+"]의 업데이트 완료!";
    }
}