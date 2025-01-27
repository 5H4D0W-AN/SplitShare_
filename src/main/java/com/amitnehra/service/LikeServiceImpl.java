package com.amitnehra.service;


import com.amitnehra.models.Likes;
import com.amitnehra.repo.LikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TreeSet;

@Service
public class LikeServiceImpl implements LikeService{
    @Autowired
    private LikeRepo likeRepo;
    @Override
    public TreeSet<Likes> getLikesFor(Long id) {
        return new TreeSet<>(likeRepo.getLikesFor(id));
    }
}
