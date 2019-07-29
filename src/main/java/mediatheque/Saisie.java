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

       // Importe();
        
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
        //Exporte();
    }

    static private void fin(ArrayList catalogue) {

        System.out.println("Catalogue des medias");

        for (int i = 0; i < catalogue.size(); ++i) {
            System.out.println(catalogue.get(i));
        }
    }
    /*
     static public void Importe() {
        try {
            FileInputStream f = new FileInputStream("export.csv");
            Scanner sc = new Scanner(f);
            String ligne;
            while (sc.hasNextLine()) {
                ligne = sc.nextLine();
                String[] e = ligne.split(";");
                if (e.length == 0) {
                    continue;
                }

                try {
                    Media m;
                    switch (e[0]) {
                        case "D":
                            m = new DVD(e[1], e[2], Integer.parseInt(e[3].strip()));
                            break;
                        case "L":
                            m = new Livre(e[1], e[2], Integer.parseInt(e[3].strip()));
                            break;
                        default:
                            continue;
                    }
                    if (!catalogue.contains(m)) {
                        catalogue.add(m);
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
            }
            f.close();

        } catch (FileNotFoundException ex) {
            return;
            // Logger.getLogger(Saisie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Saisie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static public void Exporte() {
        try {
            FileOutputStream f = new FileOutputStream("export.csv");
            PrintStream p = new PrintStream(f);
            for (Media m : catalogue) {
                m.enregistre(p);
            }
            p.close();
            f.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Saisie.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Saisie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
    */
}
