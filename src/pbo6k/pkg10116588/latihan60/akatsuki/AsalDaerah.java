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
public class AsalDaerah extends Anggota{
     protected String asal;

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }
    
    @Override
    public void tampilAkatsuki(){
        System.out.println("Asal : "+getAsal());
    }
    
}
