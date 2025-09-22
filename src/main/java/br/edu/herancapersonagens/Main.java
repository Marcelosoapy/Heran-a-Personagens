import modelo.Barbaro;
import modelo.Mago;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner input= new Scanner(System.in);
      int optionClasse;

      System.out.println("-°*--°*--°*--°*--°*--°*--°*--°*--°*--°*--°*-");
      System.out.println(" Bem vindo a zona de criação de personagens ");
      System.out.println("    Crie o personagem para sua aventura     ");
      System.out.println("-°*--°*--°*--°*--°*--°*--°*--°*--°*--°*--°*-");
      System.out.println("--------------------------------------------");

      System.out.println("| selecione sua classe de personagem");
      System.out.println("| 1- Mago");
      System.out.println("| 2- Barbaro");
      System.out.println("| 3- Templario");
      optionClasse= input.nextInt();
      input.nextLine();

      String nomePerson;
      String poderPerson;
      int danoPerson;
      Mago m1 = null;
      Barbaro b1= null;
      //Paladino p1;

      switch (optionClasse) {
          case 1:
              System.out.println("--------------------------------------------");
              System.out.println("Qual sera o nome de seu Mago");
              nomePerson = input.nextLine();
              System.out.println("Qual sera o poder de seu Mago");
              poderPerson = input.nextLine();
              System.out.println("Qual sera a capacidade de dano de seu Mago");
              danoPerson = input.nextInt();
              System.out.println("--------------------------------------------");

              m1 = new Mago(nomePerson, poderPerson, danoPerson, "Mago");

              break;
          case 2:
              System.out.println("--------------------------------------------");
              System.out.println("Qual sera o nome de seu Barbaro");
              nomePerson = input.nextLine();
              System.out.println("Qual sera o poder de seu Barbaro");
              poderPerson = input.nextLine();
              System.out.println("Qual sera a capacidade de dano de seu Barbaro");
              danoPerson = input.nextInt();
              System.out.println("--------------------------------------------");

              b1 = new Barbaro(nomePerson, poderPerson, danoPerson, "Barbaro");

              break;
          case 3:
              System.out.println("--------------------------------------------");
              System.out.println("Qual sera o nome de seu paladino");
              nomePerson = input.nextLine();
              System.out.println("Qual sera o poder de seu Paladino");
              poderPerson = input.nextLine();
              System.out.println("Qual sera a capacidade de dano de seu Paladino");
              danoPerson = input.nextInt();
              System.out.println("--------------------------------------------");

              //p1= new Paladino(nomePerson,poderPerson,danoPerson,"Mago");
      }



      System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");
      System.out.println("     Agora dê inicio a suas aventuras!!     ");
      System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*");

      int option;

      do {
        System.out.println("| Selecione uma opção a baixo:");
        System.out.println("| 1- dar upgrade em seu personagem");
        System.out.println("| 2- batalhar! ");
        System.out.println("| 3- exibir status do personagem");
        System.out.println("| 4- sair!");
        option = input.nextInt();
        input.nextLine();

        switch (option){
            case 1->{
                int optionArtefatos;
                switch (optionClasse){
                    case 1: //Mago
                        System.out.println("|Bem vindo ao mercado1!");
                        System.out.println("|Contamos com uma variedade de produtos para sua jornada");
                        System.out.println("| 1- Elixir de cura | +10 de vida");
                        System.out.println("| 2- Cajado de fogo | +15 de dano");
                        System.out.println("| 3- Cajado de gelo | +10 de dano");
                        optionArtefatos= input.nextInt();
                        input.nextLine();

                        switch (optionArtefatos){
                            case 1:
                                m1.setVida( m1.getVida() + 10 );
                                System.out.println("+++vida");
                                continue;
                            case 2:
                                m1.setDano(m1.getDano() + 15);
                                System.out.println("+++Dano");
                                continue;
                            case 3:
                                m1.setDano(m1.getDano() + 10);
                                System.out.println("++Dano");
                        }
                        continue;

                    case 2:
                        System.out.println("|Bem vindo ao mercado1!");
                        System.out.println("|Contamos com uma variedade de produtos para sua jornada");
                        System.out.println("| 1- escudo de aço| +10 de vida");
                        System.out.println("| 2- manopla de ouro | +25 de dano");
                        System.out.println("| 3- machado de gelo | +30 de dano");
                        optionArtefatos= input.nextInt();
                        input.nextLine();

                        switch (optionArtefatos){
                            case 1:
                                b1.setVida( b1.getVida() + 10 );
                                System.out.println("+++vida");
                                continue;
                            case 2:
                                b1.setDano( b1.getDano() + 25);
                                System.out.println("+++Dano");
                                continue;
                            case 3:
                                b1.setDano( b1.getDano() + 30);
                                System.out.println("++Dano");
                        }
                        continue;

                    /*case 3:
                        System.out.println("|Bem vindo ao mercado1!");
                        System.out.println("|Contamos com uma variedade de produtos para sua jornada");
                        System.out.println("| 1- unção divina| +10 de vida");
                        System.out.println("| 2- grimório sagrado| +40 de dano");
                        System.out.println("| 3- crus de platina | +45 de dano");
                        optionArtefatos= input.nextInt();
                        input.nextLine();

                        switch (optionArtefatos){
                            case 1:
                                p1.setVida( p1.getVida() + 10 );
                                System.out.println("+++vida");
                                continue;
                            case 2:
                                p1.setDano( p1.getDano() + 40);
                                System.out.println("+++Dano");
                                continue;
                            case 3:
                                p1.setDano( p1.getDano() + 45);
                                System.out.println("++Dano");
                        }
                     */
                }
            }

            case 2->{
                if(optionClasse == 1) {

                }

            }

            case 3->{

            }

            case 4->{}

            case 5->{}
        }

      }while (option !=5);



  }
}
