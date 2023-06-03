/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author Petar
 */
public class Labrador {
    private String rasa,vrsta;
    private Karakteristike karakteristike;
    private int godine;

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getVrsta() {
        return vrsta;
    }

    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }

    public Karakteristike getKarakteristike() {
        return karakteristike;
    }

    public void setKarakteristike(Karakteristike karakteristike) {
        this.karakteristike = karakteristike;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public Labrador() {
        
    }
}
