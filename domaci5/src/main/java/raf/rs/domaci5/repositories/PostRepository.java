package raf.rs.domaci5.repositories;

import raf.rs.domaci5.entities.Post;

import java.util.List;

public interface PostRepository {
    public Post addPost(Post post);
    public List<Post> allPosts();
}
