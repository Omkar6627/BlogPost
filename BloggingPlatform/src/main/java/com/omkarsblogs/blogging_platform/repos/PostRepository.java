package com.omkarsblogs.blogging_platform.repos;

import com.omkarsblogs.blogging_platform.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long> {
}
