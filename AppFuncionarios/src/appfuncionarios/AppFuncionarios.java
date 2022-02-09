/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfuncionarios;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class AppFuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aula de Construtor, sobrecarga e Encapsulamento
        Scanner entr = new Scanner(System.in);        
        System.out.println("Desenvolva um programa em Java que cadastre um \n"
            + "funcionário por meio dos atributos: nome, idade, função, \n"
            + "salário. O programa deverá calcular um desconto sobre o \n"
            + "salário, referente a um determinado imposto. Se a idade do\n"
            + "funcionário for igual ou menor que 55 deverá descontar 11%, "
            + "\nsenão, 9%. O programa deverá ainda entrar com o número de "
            + "\nfaltas, se houver, e calcular o salário líquido do \n"
            + "funcionário. Utilize construtores com parâmetros na classe "
            + "\nFuncionário. \n");
        System.out.println("Dados do funcionário:\n");
        System.out.print("Nome: ");
            String nome = entr.nextLine();
        System.out.print("Idade: ");
            int idade = entr.nextInt();
        System.out.print("Função: ");
            String funcao = entr.next();        
        System.out.print("Falta(s): ");
            int falta = entr.nextInt();
        System.out.print("Salário: R$ ");
            double salario = entr.nextDouble();
        Funcionarios funcionarios = new Funcionarios(nome, idade, funcao, falta,  
            salario);
        System.out.printf("O salário líquido é: R$ %.2f\n", 
                funcionarios.descontar()); 
        entr.close();
    }    
}