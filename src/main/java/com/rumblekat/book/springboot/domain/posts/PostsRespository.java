package com.rumblekat.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRespository extends JpaRepository<Posts,Long> {
}
