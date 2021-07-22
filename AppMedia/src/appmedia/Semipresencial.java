/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedia;

/**
 *
 * @author paulo
 */
public class Semipresencial {  // Classe filha.   
    public double atv7, atv8, atv9, atv10, atv11, atv12;
    public Semipresencial() {
    }    
    public double notac(){
        double mediac = (atv7 + atv8 + atv9 + atv10) /4;
        return mediac;
    }
    public double notad(){
        if(atv11 > atv12) {
            double mediad = atv11;
            return mediad;
        }else{
            double mediad = atv12;
            return mediad;
        }
    }
}