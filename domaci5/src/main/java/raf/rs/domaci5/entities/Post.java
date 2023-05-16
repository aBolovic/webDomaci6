package raf.rs.domaci5.entities;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class Post {

    private Integer id;
    private String sadrzaj;

    private String naslov;
    private String datumObjave;
    private String autor;

    private List<Komentar> komentars;




    public Post(){

    }

    public Post(String autor, String naslov, String sadrzaj){
        this.autor = autor;
        this.naslov = naslov;
        this.sadrzaj = sadrzaj;

    }
    public Post(String sadrzaj, String naslov, String datumObjave, String autor, List<Komentar> komentars, Integer id) {
        this.id = id;
        this.sadrzaj = sadrzaj;
        this.naslov = naslov;
        this.datumObjave = datumObjave;
        this.autor = autor;
        this.komentars = new ArrayList<>();

    }

    public String getSadrzaj() {
        return sadrzaj;
    }

    public void setSadrzaj(String sadrzaj) {
        this.sadrzaj = sadrzaj;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getDatumObjave() {
        return datumObjave;
    }

    public void setDatumObjave(String datumObjave) {
        this.datumObjave = datumObjave;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public List<Komentar> getKomentars() {
        return komentars;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setKomentars(List<Komentar> komentars) {
        this.komentars = komentars;
    }

    public void addKomentar(Komentar komentar){
        this.komentars.add(komentar);
    }
}
