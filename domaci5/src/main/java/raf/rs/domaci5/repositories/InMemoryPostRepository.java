package raf.rs.domaci5.repositories;

import raf.rs.domaci5.entities.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryPostRepository implements PostRepository {
    private static List<Post> posts = new CopyOnWriteArrayList<>();
    public InMemoryPostRepository(){
        System.out.println(this);
    }


    @Override
    public synchronized Post addPost(Post post) {
        posts.add(post);

        return post;
    }

    @Override
    public List<Post> allPosts() {
        return new ArrayList<>(posts);
    }
}
