package raf.rs.domaci5.services;

import raf.rs.domaci5.entities.Post;
import raf.rs.domaci5.repositories.PostRepository;

import javax.inject.Inject;
import java.util.List;

public class PostService {
    public PostService() {
        System.out.println(this);
    }

    @Inject
    private PostRepository postRepository;

    public Post addPost(Post post){
        return this.postRepository.addPost(post);
    }

    public List<Post> allPosts(){
        return this.postRepository.allPosts();
    }
}
