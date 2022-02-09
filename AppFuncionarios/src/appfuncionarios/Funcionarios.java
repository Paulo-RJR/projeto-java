/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appfuncionarios;

/**
 *
 * @author paulo
 */
public class Funcionarios {
    public String nome, funcao;
    public int idade, falta;
    public double salario;
    //Construtor - Personalizado, publico com parâmetros e sem retorno.
    public Funcionarios(String nome, int idade, String funcao, int falta, 
            double salario){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.falta = falta;
        this.salario = salario;
    }
    //Cosntrutor com Sobrecarga.
    /*public Funcionarios(String nome, String funcao, int idade, double 
            salario){
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;        
        this.salario = salario;
    }*/
    //Método público do tipo double, sem parâmetro e se retorno.
    /*Para calcular as faltas segui seguinte fórmula:
    salario = ((salario / horas trabalhadas por mês) * horas trabalhadas por 
    dia) * número de faltas)*/
    //Método público com retorno para calcuar os descontos no salário.
    public double descontar(){
        if(this.idade >= 55 && this.falta == 0){            
            this.salario = this.salario - (this.salario * 0.09);  
            System.out.println("\nImposto de 9%.");
        }
        
        if(this.idade >= 55 && this.falta > 0){            
            this.salario = (this.salario - (this.salario * 0.09)) - 
            (((this.salario / 240) * 9) * this.falta);
            System.out.println("\nImposto de 9%.");
            
        }else if(this.idade < 55 && this.falta > 0){            
            this.salario = (this.salario - (this.salario * 0.11)) - 
            (((this.salario / 240) * 9) * this.falta);
            System.out.println("\nImposto de 11%.");
        }else if (this.idade < 55 && this.falta == 0){            
            this.salario = (this.salario - (this.salario * 0.11));
            System.out.println("\nImposto de 11%.");
        }
        /*if(idade >= 55){
            salario = salario - (salario * 0.09);
        }
        if(idade >= 55 && falta > 0){
            salario = (salario - (salario * 0.09)) - 
                    (((salario / 240) * 9) * falta);
        }else if(idade < 55 && falta > 0){
            salario = (salario - (salario * 0.11)) - 
                    (((salario / 240) * 9) * falta);
        }else{
             salario = (salario - (salario * 0.11));
        }*/
        return salario;
    }    
}