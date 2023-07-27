package com.omkarsblogs.blogging_platform.service;

import com.omkarsblogs.blogging_platform.model.Comment;

import com.omkarsblogs.blogging_platform.repos.CommentRepository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepo;

    public String addComment(Comment comment) {
        comment.setDateCreated(LocalDateTime.now());
        commentRepo.save(comment);
        return "Comment has been added!!!";
    }

    public Comment findComment(Long commentId) {
        return  commentRepo.findById(commentId).orElse(null);
    }

    public void removeComment(Comment comment) {
        commentRepo.delete(comment);
    }

    public List<Comment> getAllCommentsForPost(Long postId) {

        return commentRepo.findByBlogPostPostId(postId);
    }

}
