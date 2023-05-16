package raf.rs.domaci5.repositories;

import raf.rs.domaci5.entities.Komentar;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InMemoryKomentarRepository implements KomentarRepository {

    private static List<Komentar> komentars = new CopyOnWriteArrayList<>();

    public InMemoryKomentarRepository() {
        System.out.println(this);
    }



    @Override
    public Komentar addKomentar(Komentar komentar) {
        komentars.add(komentar);

        return komentar;
    }

    @Override
    public List<Komentar> allKomentars() {
        return new ArrayList<>(komentars);
    }
}
