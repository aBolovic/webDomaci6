package raf.rs.domaci5;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;
import raf.rs.domaci5.repositories.InMemoryKomentarRepository;
import raf.rs.domaci5.repositories.InMemoryPostRepository;
import raf.rs.domaci5.repositories.KomentarRepository;
import raf.rs.domaci5.repositories.PostRepository;
import raf.rs.domaci5.services.KomentarService;
import raf.rs.domaci5.services.PostService;

import javax.inject.Singleton;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/api")
public class HelloApplication extends ResourceConfig {

    public HelloApplication(){
        // Definisemo implementacije u dependency container-u
        AbstractBinder binder = new AbstractBinder() {
            @Override
            protected void configure() {
                this.bind(InMemoryPostRepository.class).to(PostRepository.class).in(Singleton.class);

                this.bindAsContract(PostService.class);

                this.bind(InMemoryKomentarRepository.class).to(KomentarRepository.class).in(Singleton.class);

                this.bindAsContract(KomentarService.class);


            }
        };
        register(binder);

        // Ucitavamo resurse
        packages("raf.rs.domaci5.resources");
    }
}