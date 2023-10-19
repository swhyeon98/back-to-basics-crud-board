package io.github.swhyeon98.board.controller;

import io.github.swhyeon98.board.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostService postService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("post", postService.findAll());
        return "index";
    }

    @GetMapping("/post/save")
    public String postsSave() {
        return "post-save";
    }
}
