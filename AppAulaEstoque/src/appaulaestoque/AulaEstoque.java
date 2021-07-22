/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaulaestoque;

/**
 *
 * @author paulo
 */
public class AulaEstoque {
    /*public String nome;
    public double preco;
    public int qtdEstoque;*/
    //MUDAR PARA O TIPO PRIVADO.
    private String nome;
    private double preco;
    private int qtdEstoque;
    //CONSTRUTOR PERSONALIZADO (NÃO TEM RETORNO)
    public AulaEstoque(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }	
    //SOBRECARGA
    public AulaEstoque(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // USAR OS MÉTODOS SET E GET, APÓS MUDAR O TIPO DE ACESSOS AOS ATRIBUTOS.
    public String getNome() {
        return nome;		
    }	
    public void setNome(String nome) {
        this.nome = nome;	
    }	
    public double getPreco() {
        return preco;
    }	
    public void setPreco(double preco) {
        this.preco = preco;
    }	
    public int getQtdEstoque() { // ESSE ATRIBUTO NÃO PODE SER ALTERADO
        return qtdEstoque;
    }//FIM DO USO DOS SET E GET
    public double totalEstoque() {	
        return preco * qtdEstoque;
    }
    public void adicionarProduto(int qtdEstoque) {
        this.qtdEstoque += qtdEstoque;
    }
    public void removerProduto(int qtdEstoque) {
        this.qtdEstoque -= qtdEstoque;
    }	
    public String toString() {
        return nome + " " + preco + " " + qtdEstoque + " " + totalEstoque() ;
    }
}