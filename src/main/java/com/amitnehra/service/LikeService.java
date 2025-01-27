package com.amitnehra.service;

import com.amitnehra.models.Likes;

import java.util.TreeSet;

public interface LikeService {
    TreeSet<Likes> getLikesFor(Long id);
}
