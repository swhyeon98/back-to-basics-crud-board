package io.github.swhyeon98.board.repository;

import io.github.swhyeon98.board.domain.Post;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PostRepository {

    private static Map<Long, Post> store = new HashMap<>();
    private static long sequence = 0L;

    public Post save(Post post) {
        post.setId(++sequence);
        store.put(post.getId(), post);
        return post;
    }

    public List<Post> findAll() {
        return new ArrayList<>(store.values());
    }
}
