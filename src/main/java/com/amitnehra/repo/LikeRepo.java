package com.amitnehra.repo;

import com.amitnehra.models.Likes;

import java.util.List;

public interface LikeRepo {
    List<Likes> getLikesFor(Long id);
}
