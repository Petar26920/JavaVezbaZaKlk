/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.Collection;

/**
 *
 * @author Petar
 */
public class Karakteristike {

    @Override
    public String toString() {
        return "Karakteristike{" + "velicina=" + velicina + ", duzinaDlake=" + duzinaDlake + ", bojaDlake=" + bojaDlake + ", bojaOka=" + bojaOka + '}';
    }
    private String velicina,duzinaDlake;
    private Collection bojaDlake,bojaOka;

    public Karakteristike() {
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public String getDuzinaDlake() {
        return duzinaDlake;
    }

    public void setDuzinaDlake(String duzinaDlake) {
        this.duzinaDlake = duzinaDlake;
    }

    public Collection getBojaDlake() {
        return bojaDlake;
    }

    public void setBojaDlake(Collection bojaDlake) {
        this.bojaDlake = bojaDlake;
    }

    public Collection getBojaOka() {
        return bojaOka;
    }

    public void setBojaOka(Collection bojaOka) {
        this.bojaOka = bojaOka;
    }
    
}
