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
public class Ami extends Personne implements Facebook {

    String prenom;
    String profilFacebook = "AmiFb";

    public Ami(String prenom, String nom) {
        super(nom);
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Ami " + prenom + " " + nom;
    }

    @Override
    public String getProfil() {
        return profilFacebook;
    }
}
