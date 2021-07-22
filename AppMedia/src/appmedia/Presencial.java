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
public class Presencial { // Classe filha.
    public double atv1, atv2, atv3, atv4, atv5, atv6; // Criando Atributos do 
    // tipo público.    
    public double nataa(){  // Criando um Método com retorno.
        double mediaa = (atv1 + atv2 + atv3) / 3;
        return mediaa; // Retorna a própria fórmula, ou seja, sem retorno.       
    } 
    public double notab(){ // Criando um Método com retorno.
        if(atv5 > atv6){  // Estrutura condicional para uso de um Atributo 
            // (Se a condição for Verdadira).
            double mediab = (atv4 * 0.1) + (atv5 * 0.9);
            return mediab;
        }/*else if(atv5 == 0 && atv6 == 0){
            double mediab = atv4;
            return mediab;
        }*/else{  // Estrutura condicional para uso de um Atributo 
            // (Se a condição for Falsa).
            double mediab = (atv4 * 0.1) + (atv6 * 0.9);
            return mediab;
        }    
    }
}