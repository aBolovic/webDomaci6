package raf.rs.domaci5.entities;

public class Komentar {

    private String text;
    private String name;

    private Integer id;
    public Komentar(){

    }
    public Komentar(String text, String name) {
        this.text = text;
        this.name = name;
    }

    public Komentar(String text, String name, Integer id) {
        this.text = text;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
