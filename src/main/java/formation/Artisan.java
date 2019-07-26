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
public class Artisan extends Personne {

    public String specialite;

    public Artisan(String nom, String specialite) {
        super(nom);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Artisan" + nom + " " + specialite;
    }
}
