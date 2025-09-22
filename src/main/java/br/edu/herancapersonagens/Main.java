import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner imput= new Scanner(System.in);
      System.out.println("Bem vindo a zona de criação de personagens: ");
      System.out.println("Selecione uma opção e inicie sua aventura; ");
      int option;
      do {
        System.out.println("1- criar personagem");
        System.out.println("2- dar upgrade em seu personagem");
        System.out.println("3- batalhar! ");
        System.out.println("4- exibir status do personagem");
        System.out.println("5- sair!");
        option = imput.nextInt();
        imput.nextLine();

        switch (option){
            case 1->{}

            case 2->{}

            case 3->{}

            case 4->{}

            case 5->{}
        }

      }while (option==5);



  }
}
