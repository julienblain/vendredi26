/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatheque;

/**
 *
 * @author Administrateur
 */
final public class Livre extends Media {
    
    private String nbPages;

     public Livre(String titre, String auteur, String nbPages) throws Exception {
        super(titre, auteur);
        this.setNbPages(nbPages);
    }
     
     
    public String getNbPages() {
        return nbPages;
    }

    public void setNbPages(String nbPages) {
        this.nbPages = nbPages;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(titre);
        sb.append(",");
        sb.append(getAuteur());
        sb.append(",");
        sb.append(getNbPages());
        return sb.toString();
    }
    
   
    
}
