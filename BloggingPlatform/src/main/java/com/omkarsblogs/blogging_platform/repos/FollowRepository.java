package com.omkarsblogs.blogging_platform.repos;

import com.omkarsblogs.blogging_platform.model.Follow;
import com.omkarsblogs.blogging_platform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface FollowRepository extends JpaRepository<Follow, Long> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}
