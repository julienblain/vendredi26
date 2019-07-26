/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Saisie {

    static private Media m;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {

        var catalogue = new ArrayList<Media>();

        System.out.println("Saisissez le type livre/dvd (L/D),titre,auteur,et nombre de pages/durée. (FIN pour finir)");
        Scanner sc = new Scanner(System.in);
        String ligne = sc.nextLine();

        while (!(ligne.equals("FIN"))) {

            String[] e = ligne.split(",");

            try {
                //verification que la virgule est separatrice de 2 var
                if (e.length == 4) {
                    //remove blank
                    e[0] = e[0].trim();
                    e[1] = e[1].trim();
                    e[2] = e[2].trim();
                    e[3] = e[3].trim();

                    //try pour type de media, donc l'instanciation de l'objet
                    try {
                        if (e[0].equals("L")) {
                            m = new Livre(e[0], e[1], e[2]);
                        } else if (e[0].equals("D")) {
                            m = new Dvd(e[0], e[1], e[2]);
                        } else {
                            throw new Exception("Entrez un type valide.");
                        }

                        if (!catalogue.contains(m)) { //marche pas
                            catalogue.add(m);
                        }

                    } catch (Exception er) {
                        System.out.println(er.getMessage());
                    }
                } else {
                    throw new Exception("Toutes les informations sont indispensable.");
                }
            } catch (Exception er) {
                System.out.println(er.getMessage());
            } finally {
                ligne = sc.nextLine();
            }
        }
        fin(catalogue);
    }

    static private void fin(ArrayList catalogue) {

        System.out.println("Catalogue des medias");

        for (int i = 0; i < catalogue.size(); ++i) {
            System.out.println(catalogue.get(i));
        }
    }
}
