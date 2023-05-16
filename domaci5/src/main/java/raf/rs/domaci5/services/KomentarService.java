package raf.rs.domaci5.services;

import raf.rs.domaci5.entities.Komentar;
import raf.rs.domaci5.repositories.KomentarRepository;

import javax.inject.Inject;
import java.util.List;

public class KomentarService {

    @Inject
    private KomentarRepository komentarRepostiry;

    public KomentarService() {
        System.out.println(this);
    }

    public Komentar addKomentar(Komentar komentar){
        return this.komentarRepostiry.addKomentar(komentar);
    }

    public List<Komentar> allKomentars(){
        return this.komentarRepostiry.allKomentars();
    }
}
