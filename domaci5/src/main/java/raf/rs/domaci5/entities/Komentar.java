package raf.rs.domaci5.entities;

public class Komentar {

    private String text;
    private String name;

    public Komentar(){

    }
    public Komentar(String text, String name) {
        this.text = text;
        this.name = name;
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
}
