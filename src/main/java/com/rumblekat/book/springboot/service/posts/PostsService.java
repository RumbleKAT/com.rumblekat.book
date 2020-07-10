package com.rumblekat.book.springboot.service.posts;

import com.rumblekat.book.springboot.domain.posts.Posts;
import com.rumblekat.book.springboot.domain.posts.PostsRespository;
import com.rumblekat.book.springboot.web.dto.PostsResponseDto;
import com.rumblekat.book.springboot.web.dto.PostsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRespository postsRespository;

    public Long save(PostsSaveRequestDto requestDto) {
        return postsRespository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostsSaveRequestDto requestDto) {
        Posts post =  postsRespository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        post.update(requestDto.getTitle(),requestDto.getContent());
        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRespository.findById(id).orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        return new PostsResponseDto(entity);
    }
}
