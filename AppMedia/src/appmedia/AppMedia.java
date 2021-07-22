/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmedia;
import java.util.Scanner;
//import appmedia.Presencial; Não precisa importar esta Classe, pois ele 
// esta no mesmo Pacote da Classe Pai (Classe Principal).
/**
 *
 * @author paulo
 */
public class AppMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcao = 0;        
        double mda, mdb, mdc, mdd, mdf;       
        Scanner sc = new Scanner(System.in);
        Presencial pres;
        Semipresencial spres;
        //Cadastrar cadr; //PARA USAR PRECISA RETIRAR O CONSTRUTOR.
        pres = new Presencial(); //Instanciando um Objeto para a 
        // classe "Presencial".
        spres = new Semipresencial(); //Instanciando um Objeto para a 
        // classe "Semipresencial".
        //cadr = new Cadastrar(); //PARA USAR PRECISA RETIRAR O CONSTRUTOR.
        // classe "Cadastrar".
        System.out.print("\tFMU - Faculdades Metropolitanas Unidas:\n" + "\n"
            + "Programa para calculo da Média:(segundo as novas regras):\n" 
            + "\nEscolha a modalidade do seu curso:\n1 - Presencial. "
            + "\n2 - Semipresencial.\n");
        while (opcao < 1 || opcao > 2){ // Continua no Loop até que o usário 
            //informe um número valido (neste caso 1 ou 2).            
            System.out.print("Informe a opcão escolhida? ");
                opcao = sc.nextInt();            
        }
        System.out.println("\nDados do aluno(a):");
        System.out.print("Nome: ");
            String nome = sc.next(); //VARIÁVEL TEMPORÁRIA.
         System.out.print("Matéria: ");
            String materia = sc.next(); //VARIÁVEL TEMPORÁRIA.
        System.out.print("Curso: ");
            String curso = sc.next(); //VARIÁVEL TEMPORÁRIA.
        System.out.print("RA: ");
            int ra = sc.nextInt(); //VARIÁVEL TEMPORÁRIA.      
        Cadastrar aluno = new Cadastrar(nome, materia);              
        switch(opcao){ // Para executar o menu de escolha. 
            case 1:               
                System.out.println("\nDigite as notas para a média da sua N1:");
                System.out.print("Atividade-1: ");
                    pres.atv1 = sc.nextDouble();
                System.out.print("Atividade-2: ");
                    pres.atv2 = sc.nextDouble();
                System.out.print("Atividade-3: ");
                    pres.atv3 = sc.nextDouble();                
                mda = pres.nataa();
                    //System.out.printf("Média da N1: %.1f\n", pres.nataa());                    
                    System.out.printf("Média da N1: %.1f\n", mda); // Uso 
                    //"printf", para poder manipular as casas decimais no 
                    //resultado da média, ao estilo Linguagem C.
                System.out.println("\nDigite as notas para a média da sua N2:");
                System.out.print("Atividade-4: ");
                    pres.atv4 = sc.nextDouble();
                System.out.print("Atividade-5: ");
                    pres.atv5 = sc.nextDouble();
                System.out.print("Atividade-6: ");
                    pres.atv6 = sc.nextDouble(); 
                mdb = pres.notab();
                    //System.out.printf("Média da N2: %.2f", pres.notab());
                    System.out.printf("Média da N2: %.2f\n", mdb); // Uso 
                        //"printf", para poder manipular as casas decimais no 
                        //resultado da média, ao estilo Linguagem C.
                    System.out.println("\n\nAluno: " + aluno.getNome());
                    System.out.print("Matéria: " + aluno.getMateria());
                    mdf = (mda * 0.4) + (mdb * 0.6);
                    //mdf = (pres.nataa() * 0.4) + (pres.notab() * 0.6);                    
                    System.out.printf("\nMédia Final: %.2f\n", mdf);                
                if(mdf >= 6.0){                    
                    System.out.print("APROVADO!\n");
                }else{                       
                    System.err.print("REPROVADO\n");
                }                
                break; //Finaliza a execução do Switch-Case-1.
            case 2:
                System.out.println("\nDigite as notas para a média da sua N1:");
                System.out.print("Atividade-1: ");
                    spres.atv7 = sc.nextDouble();
                System.out.print("Atividade-2: ");
                    spres.atv8 = sc.nextDouble();
                System.out.print("Atividade-3: ");
                    spres.atv9 = sc.nextDouble();
                System.out.print("Atividade-4: ");
                    spres.atv10 = sc.nextDouble();
                mdc = spres.notac();
                    System.out.printf("Média da N1: %.1f\n", mdc); // Uso 
                    //"printf", para poder manipular as casas decimais no 
                    //resultado da média, ao estilo Linguagem C.
                System.out.println("\nDigite as notas para a média da sua N2:");
                System.out.print("Atividade-5: ");
                    spres.atv11 = sc.nextDouble();
                System.out.print("Atividade-6: ");
                    spres.atv12 = sc.nextDouble();
                mdd = spres.notad();
                System.out.printf("Média da N2: %.2f", mdd); // Uso 
                    //"printf", para poder manipular as casas decimais no 
                    //resultado da média, ao estilo Linguagem C.
                mdf = (mdc * 0.4) + (mdd * 0.6);
                    System.out.println("\n\nAluno: " + aluno.getNome());
                    System.out.print("Matéria: " + aluno.getMateria());
                    System.out.printf("\nMédia Final: %.2f\n", mdf);
                if(mdf >= 6.0){                    
                    System.out.print("APROVADO!\n");
                }else{                      
                    System.err.print("REPROVADO\n");
                }
                break;  // Finaliza a execução do Switch-Case-2.              
        }        
        System.out.println("\n\t----- FIM DO PROGRAMA -----");
        sc.close();
    }    
}