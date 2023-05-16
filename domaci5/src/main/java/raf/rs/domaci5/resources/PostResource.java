package raf.rs.domaci5.resources;

import raf.rs.domaci5.entities.Komentar;
import raf.rs.domaci5.entities.Post;
import raf.rs.domaci5.services.PostService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class PostResource {
    @Inject
    private PostService postService;


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response all(){
        return Response.ok(this.postService.allPosts()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Post create(Post post){
        return this.postService.addPost(post);
    }


}
