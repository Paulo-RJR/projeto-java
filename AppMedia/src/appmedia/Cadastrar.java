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
public class Cadastrar {
    private String nome;
    private String materia;
    private String curso;
    private int ra;
    //CONSTRUTOR PERSONALIZADO (NÃO TEM RETORNO).
    public Cadastrar(String nome, String materia, String curso, int ra){
        this.nome = nome;
        this.materia = materia;
        this.curso = curso;
        this.ra = ra;
    }
    //SOBRECARGA
     public Cadastrar(String nome, String materia){
        this.nome = nome;
        this.materia = materia;        
    } 
    // USO DO SET E GET.
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMateria(){
        return materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public int getRa(){
        return ra;
    }
    public void setRa(int ra){
        this.ra = ra;
    }
}
