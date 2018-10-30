/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan60.akatsuki;

/**
 *
 * @author Indra F
 */
public class Perilaku extends Anggota{
    protected String ciriKhas;

    public String getCiriKhas() {
        return ciriKhas;
    }

    public void setCiriKhas(String ciriKhas) {
        this.ciriKhas = ciriKhas;
    }
    
    @Override
 public void tampilAkatsuki(){
        System.out.println("Ciri Khas : "+getCiriKhas());
    }
    
}
