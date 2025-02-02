package com.amitnehra.controller;


import com.amitnehra.models.Account;
import com.amitnehra.models.Comments;
import com.amitnehra.models.Likes;
import com.amitnehra.models.Post;
import com.amitnehra.service.AccountService;
import com.amitnehra.service.CommentService;
import com.amitnehra.service.LikeService;
import com.amitnehra.service.PostService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;
import java.util.TreeSet;

@Controller
public class ProfileController {
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private LikeService likeService;
    @Autowired
    private AccountService accountService;


    @RequestMapping("/profile/{id}")
    @Transactional
    public String returnProfile(@PathVariable String id, HttpSession session, Model model){
        if(id == null) return "error";
        List<Post> posts = postService.fetchPosts(id);
        Account account = accountService.findUser(id);
        model.addAttribute("account", account);
        model.addAttribute("posts", posts);
        return "profilePage";
    }
}
