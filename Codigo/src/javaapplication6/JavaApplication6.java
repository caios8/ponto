import java.util.*;

import org.w3c.dom.Text;

import java.text.*;

class Main {

    public static void main(String[] args) {

        int op, cod, opcod = 0;
        String nome = "", empre;

        SimpleDateFormat ponto = new SimpleDateFormat("dd/MM/yyyy hh:mm");

        Date entra = new Date();
        Date entraalmo = new Date();
        Date retornoalmo = new Date();
        Date saida = new Date();
        
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Insira o Nome da Empresa: ");
        empre = entrada.next();

        System.out.printf("Insira o seu Codigo: ");
        cod = entrada.nextInt();

        if(cod == 1111){
          nome = "Matheus Borri";
        }else if(cod == 2222){
          nome = "Caio Souza";
        }else{
          System.out.printf("Codigo incorreto, ou sua empresa ainda não fez seu cadastro em nosso sistema, entre em contato com o RH de sua empresa para mais informações.\n Deseja:\n Inserir um novo codigo? [ 1 ]\n Finalizar o programa? [ 2 ]\n");
          opcod = entrada.nextInt();
          if(opcod == 1){
            System.out.printf("Insira o seu Codigo: ");
            cod = entrada.nextInt();
            if(cod == 1111){
              nome = "Matheus Borri";
            }else if(cod == 2222){
              nome = "Caio Souza";
            }
          }else if(opcod == 2){
            System.exit(0);
          }else{
            System.out.printf("Opção Invalida! O programa sera encerrado.");
            System.exit(0);
          }
        }

        System.out.printf("Você deseja registrar o ponto da:\nEntrada [ 1 ]\nEntrada do Almoço [ 2 ]\nRetorno do Almoço [ 3 ]\nSaida [ 4 ]\nQual sua opção? ");
        op = entrada.nextInt();

        if (op == 1) {
          System.out.printf("Empresa: " + empre + "\n" + "Codigo e nome do funcionário: " + cod + " - " + nome + "\n" + "Entrada: ");
          System.out.println(ponto.format(entra));
        }else if(op == 2){
          System.out.printf("Empresa: " + empre + "\n" + "Codigo e nome do funcionário: " + cod + " - " + nome + "\n" + "Entrada do Almoço: ");
           System.out.println(ponto.format(entraalmo));
        }else if(op == 3){
          System.out.printf("Empresa: " + empre + "\n" + "Codigo e nome do funcionário: " + cod + " - " + nome + "\n" + "Retorno do Almoço: ");
          System.out.println(ponto.format(retornoalmo));
        }else if(op == 4){
          System.out.printf("Empresa: " + empre + "\n" + "Codigo e nome do funcionário: " + cod + " - " + nome + "\n" + "Retorno do Almoço: ");
          System.out.println(ponto.format(saida));
        }
    }
}
