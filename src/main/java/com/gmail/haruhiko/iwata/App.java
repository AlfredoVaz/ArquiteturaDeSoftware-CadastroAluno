package com.gmail.haruhiko.iwata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App{

    private static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
    public static void main(String[] args) throws IOException {
    	
//    	Nome de váriaveis compreensiveis
//      Scanner r = new Scanner(System.in);
      
      Scanner leitor = new Scanner(System.in);

// Nome de váriaveis compreensiveis - dava a entender uma lista
//  Alunos aluno;
      
      Aluno aluno;
      
     // Reutilização dos componentes
     // ArrayList<Aluno> alunos = new ArrayList<Aluno>();
      
      
 // Nome de váriaveis compreensiveis - dava a entender uma lista
//      ArrayList<Alunos> alunos = new ArrayList<Alunos>();

//    int i=0; Uso minimo de recursos
      
//      Nome de variaveis comp
//      int x=0;
      
      int opcaoMenu=0;
      
//		Nome de Variaveis compreensiveis - quebra de complexidade
//      char sn;
      
      char opcaoContinuar;
      
      int a=1;
//    int n=0; Uso minimo de recursos

      System.out.println("BEM VINDO AO CADASTRO DE ALUNOS");

      do{

        System.out.println("< 1 > - Cadastrar");
        System.out.println("< 2 > - Consultar");
        System.out.println("< 3 > - Sair");
        
//        Nome de váriaveis compreensiveis
//        x = r.nextInt();
//        r.nextLine();
        
        
        opcaoMenu = leitor.nextInt();
        leitor.nextLine();
        
        
        switch (opcaoMenu){
          case 1:
            System.out.println("Informe os dados:");
            do{

              System.out.println("Nome: ");
              
              // Variaveis com nome compreensiveis
//              String nome = r.nextLine();
              String nome = leitor.nextLine();
              
//				Uso minimo de recursos - linhas
//              System.out.println("RA: ");
//              String ra = r.nextLine();
//
//              System.out.println("Curso: ");
//              String curso = r.nextLine();

              
       // Nome de váriaveis compreensiveis - dava a entender uma lista
//              aluno = new Alunos();

              aluno = new Aluno();
              
              aluno.setNome(nome);
              
//				Uso minimo de recursos - linhas
//              aluno.setRA(ra);
//              aluno.setCurso(curso);

              
//              Divisão do código em métodos - metodo validarAluno
//              if(alunos.size() == 0){
//                alunos.add(aluno);
//              }else{
//                n=0;
//                for(i=0; i<alunos.size() ;i++){
//                  if(aluno.getNome().equals(alunos.get(i).getNome()) ){
//                    n=1;
//                    System.out.println("Aluno ja cadastrado!");
//                    break;
//                  }
                  
                  // Uso minino de recursos - linhas
//                  if(aluno.getRA().equals(alunos.get(i).getRA())){
//                    n=1;
//                    System.out.println("RA ja cadastrado!");
//                    break;
//                  }
//                }
//                if( n == 0 ){
//                  alunos.add(aluno);
//                }
//              }

              	// Uso Minimo de recursos
//              i = alunos.size();
//              System.out.println("Prosseguir para o proximo? <S/N>");
              
//              Nome de váriaveis compreensiveis
//              sn = (char)System.in.read();
              
              opcaoContinuar = (char)System.in.read();
              
              //Variaveis com nome compreensiveis
              //r.nextLine();
              leitor.nextLine();
              
//              Nome de variaveis compreensiveis
//              if(sn == 's' || sn == 'S'){
              
              if(opcaoContinuar == 's' || opcaoContinuar == 'S') {
            	  opcaoMenu=1;
              }else{
            	  opcaoMenu=0;
              }

          }while(opcaoMenu==1);
            break;

          case 2:
        	  
//        	  modularizção do código - metodo listarAlunos
//            i = alunos.size();
//            for(n=0; n<i ; n++){
//              aluno = alunos.get(n);
//            System.out.println("Alunos: "+aluno.getNome()+" "+aluno.getRA()+" "+aluno.getCurso());
//            }
            break;

          case 3:
            a = 0;
            break;
          default:
            System.out.println("Opção Inválida");
        }
      }while(a == 1);
    }
    
    public static Boolean validarNome(String nome) {
    	for(Aluno aluno : alunos) {
    		if(aluno.getNome().equals(nome)) {
    			System.out.println("Aluno ja cadastrado!");
    			return false;
    		} 
    		return true;
    	}
    	return null;
    }
    
    public static Boolean cadastrarAluno() {
    	return null;
    }
    
    public static void listarAluno() {
    	for(Aluno aluno : alunos) {
    		System.out.println("Aluno: "+aluno.getNome());
    	}
    }
}
