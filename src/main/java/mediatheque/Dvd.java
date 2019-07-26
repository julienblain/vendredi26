/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

import java.io.PrintStream;

/**
 *
 * @author Administrateur
 */
final public class Dvd extends Media {

    private String nbMinutes;

    public Dvd(String titre, String auteur, String nbMinutes) throws Exception {
        super(titre, auteur);
    }

    public String getNbMinutes() {
        return nbMinutes;
    }

    public void setNbMinutes(String nbMinutes) {
        this.nbMinutes = nbMinutes;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(titre);
        sb.append(",");
        sb.append(getAuteur());
        sb.append(",");
        sb.append(getNbMinutes());
        return sb.toString();
    }
    
    @Override
    public void enregistre(PrintStream p) {
        StringBuilder sb = new StringBuilder("D");
        sb.append(",");
        sb.append(getTitre());
         sb.append(",");
        sb.append(getAuteur());
        sb.append(",");
        sb.append(getNbMinutes());
        p.println(sb.toString());
    }

}
