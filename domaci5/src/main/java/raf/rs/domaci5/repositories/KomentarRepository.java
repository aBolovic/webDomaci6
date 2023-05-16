package raf.rs.domaci5.repositories;

import raf.rs.domaci5.entities.Komentar;

import java.util.List;

public interface KomentarRepository {

    public Komentar addKomentar(Komentar komentar);
    public List<Komentar> allKomentars();
}
