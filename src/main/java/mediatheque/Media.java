/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

import java.io.PrintStream;
import java.util.Objects;

/**
 *
 * @auteur Administrateur
 */
 public class Media {

    protected String titre;
    protected String auteur;

    public Media(String titre, String auteur) throws Exception {
        this.setTitre(titre);
        this.setAuteur(auteur);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) throws Exception {

        String titreT = titre.trim();

        if (titreT.isBlank() || titreT.isEmpty()) {
            throw new Exception("Veuillez entrer un titre valide, try again.");
        } else {
            this.titre = titre;
        }
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) throws Exception {
        String auteurT = auteur.trim();
        if (auteurT.isBlank() || auteurT.isEmpty() /*auteurT == null || auteurT.strip().length() == 0*/) { 
            throw new Exception("Veuillez entrer un auteur valide, try again");
        } else {
            this.auteur = auteur;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(titre);
        sb.append(",");
        sb.append(getAuteur());
        return sb.toString();
    }
    
    public void enregistre(PrintStream p) {
        
    }

}
