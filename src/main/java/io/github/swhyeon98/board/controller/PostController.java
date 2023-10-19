package io.github.swhyeon98.board.controller;

import io.github.swhyeon98.board.domain.Post;
import io.github.swhyeon98.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/post")
@RestController
public class PostController {

    private final PostService postService;

    @PostMapping("/save")
    public ResponseEntity<Post> save(@RequestBody Post post) {
        return new ResponseEntity<>(postService.savePost(post), HttpStatus.CREATED);
    }
}
