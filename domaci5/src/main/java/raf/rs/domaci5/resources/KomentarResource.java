package raf.rs.domaci5.resources;

import raf.rs.domaci5.entities.Komentar;
import raf.rs.domaci5.entities.Post;
import raf.rs.domaci5.services.KomentarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/posts")
public class KomentarResource {

    @Inject
    private KomentarService komentarService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllKomentari(){
        return Response.ok(this.komentarService.allKomentars()).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Komentar createKomentar(Komentar komentar){
        return this.komentarService.addKomentar(komentar);
    }

}
