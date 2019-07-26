/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation;

/**
 *
 * @author Administrateur
 */
public class MembreFamille extends Personne implements Facebook {

    Parente parente;
    String prenom;
    String profilFacebook = "membreFb";

    public MembreFamille(String prenom, String nom, Parente parente) {
        super(nom);
        this.prenom = prenom;
        this.parente = parente;
    }

    @Override
    public String toString() {
        return parente + " " + prenom + " " + nom;
    }

    @Override
    public String getProfil() {
       return profilFacebook;
    }
}
