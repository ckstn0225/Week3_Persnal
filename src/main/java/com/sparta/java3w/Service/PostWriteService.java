package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostUpdateDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostWriteService {

    private final PostRepository postRepository;

    @Transactional
    public String WritePost(PostUpdateDto requestDto){
        Post post = new Post(requestDto);
        postRepository.save(post);
        return  "ID: ["+post.getId()+"]의 저장완료";
    }
}
