package com.omkarsblogs.blogging_platform.repos;

import com.omkarsblogs.blogging_platform.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByBlogPostPostId(Long postId);
}
