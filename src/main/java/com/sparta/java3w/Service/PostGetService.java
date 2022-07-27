package com.sparta.java3w.Service;

import com.sparta.java3w.Dto.PostGetDto;
import com.sparta.java3w.Entity.Post;
import com.sparta.java3w.Repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PostGetService {

    private final PostRepository postRepository;
    //    글 전체 조회 사용  [GET api/posts]
    public List<PostGetDto> onlytad() {
        List<Post> tours = postRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        List<PostGetDto> GetDto = new ArrayList<>();
        for (int i = 0; i < postRepository.count(); i++) {
            Post postinfo = tours.get(i);
            PostGetDto postGetDto = new PostGetDto(postinfo.getTitle(), postinfo.getAuther(), postinfo.getCreatedAt(),postinfo.getModifiedAt());
            GetDto.add(postGetDto);
        }
        return GetDto;
    }
}
