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
abstract public class Personne {
    public String nom;
    public Personne(String nom) {this.nom=nom;}

    @Override
    public String toString() {
        return nom;
    }
}
