/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation;

import java.util.ArrayList;

/**
 *
 * @author Administrateur
 */
public class Entree {

    static public void main(String[] args) {
        ArrayList<Personne> annuaire = new ArrayList<>();
        annuaire.add(new Ami("Jean", "Dupond"));
        annuaire.add(new Artisan("Sos", "electricien"));
        annuaire.add(new MembreFamille("Simone", "Martin", Parente.Tante));
        System.out.println(annuaire);

        for (Personne p : annuaire) {
            if (p instanceof Facebook) {
                System.out.println(p);
                Facebook f = (Facebook) p;
                String fb = f.getProfil();
                System.out.println(fb);       
            }
        }
    }

}
