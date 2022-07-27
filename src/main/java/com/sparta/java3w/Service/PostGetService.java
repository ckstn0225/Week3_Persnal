package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostGetDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostGetService {

    private final PostRepository postRepository;
    //    글 전체 조회 사용  [GET api/posts]
    public List<PostGetDto> onlytad() {
        List<PostGetDto> postGetDtos1 = new ArrayList<>();
        for (int i = 0; i < postRepository.count(); i++) {
            Post postinfo = postRepository.findAll().get(i);
            PostGetDto postGetDto = new PostGetDto(postinfo.getTitle(), postinfo.getAuther(), postinfo.getCreatedAt());
            postGetDtos1.add(postGetDto);
        }
        return postGetDtos1;
    }
}
