package com.amitnehra.service;

import com.amitnehra.dto.PostDto;
import com.amitnehra.models.Account;
import com.amitnehra.models.Post;

import java.util.List;

public interface PostService {
    List<Post> fetchPosts(String id);

    void save(PostDto postData, String accountId);

    List<Post> fetchPosts(List<Account> list, int page, int size);
}
