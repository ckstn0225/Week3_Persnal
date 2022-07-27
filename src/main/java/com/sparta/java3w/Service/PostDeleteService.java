package com.sparta.java3w.Service;

import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostDeleteService {

    private final PostRepository postRepository;

    @Transactional
    public String DeletePost(Long id){
        postRepository.deleteById(id);
        return "ID: ["+id+"]의 삭제 완료";
    }
}
