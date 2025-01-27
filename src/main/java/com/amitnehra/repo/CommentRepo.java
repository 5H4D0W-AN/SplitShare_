package com.amitnehra.repo;

import com.amitnehra.models.Comments;

import java.util.List;
import java.util.TreeSet;

public interface CommentRepo {
    List<Comments> getCommentsFor(Long id);
}
