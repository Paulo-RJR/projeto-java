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
    //Método público com retorno para calcular os descontos de imposto no salário.
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
        return salario;
    }    
}