/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appaulaestoque;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class AppAulaEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//PROGRAMA DE EXEMPLO FEITO EM AULA
        Scanner teclado = new Scanner (System.in);		
        System.out.println("Entre com os dados do produto: ");		
        //PRIMEIRO LER OS DADOS
        System.out.print("Nome: ");
            String nome = teclado.nextLine(); // VARIÁVEL TEMPORÁRIA		
        System.out.print("Preço: ");
            double preco = teclado.nextDouble(); //VARIÁVEL TEMPORÁRIA		
        //DEPOIS CRIAR O CONSTRUTOR
        AulaEstoque produto = new AulaEstoque(nome, preco);		
        System.out.println("\nOs dados do produto são: " + produto);		
        System.out.println();		
        System.out.print("Entre com o valor a ser adicionado no estoque: ");
            int qtde = teclado.nextInt();		
        produto.adicionarProduto(qtde);		
        System.out.println();		
        System.out.println("Dados atualizados: " + produto);		
        System.out.print("\nEntre com o valor a ser removido do estoque: ");
            qtde = teclado.nextInt();
        produto.removerProduto(qtde);		
        System.out.println("\nDados atualizados: " + produto);
    }    
}