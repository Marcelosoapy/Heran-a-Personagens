import modelo.Barbaro;
import modelo.Guerreiro;
import modelo.Mago;
import modelo.Paladino;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
      Main operacao = new Main();
      Scanner input= new Scanner(System.in);
      int optionClasse;

      Guerreiro[] container= new Guerreiro[1];
      container[0] = null;

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
      Paladino p1 = null;

      System.out.println("--------------------------------------------");
      System.out.println("Qual sera o nome do(a) personagem?");
      nomePerson = input.nextLine();
      System.out.println("Qual sera o poder do(a) personagem?");
      poderPerson = input.nextLine();
      System.out.println("Qual sera a capacidade de dano do(a) personagem?");
      danoPerson = input.nextInt();
      System.out.println("--------------------------------------------");

      switch (optionClasse) {
          case 1:
              m1 = new Mago(nomePerson, poderPerson, danoPerson, "Mago");
              container[0] = m1;

              break;
          case 2:
              b1 = new Barbaro(nomePerson, poderPerson, danoPerson, "Barbaro");
              container[0] = b1;

              break;
          case 3:
              p1= new Paladino(nomePerson,poderPerson,danoPerson,"Mago");
              container[0] = p1;
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
        System.out.println(" ");

        switch (option){
            case 1 -> {

                switch (optionClasse) {
                    case 1:
                        operacao.upgrade(m1, optionClasse);
                        continue;
                    case 2:
                        operacao.upgrade(b1, optionClasse);
                        continue;
                    case 3:
                        operacao.upgrade(p1, optionClasse);

                }


            } // upgrades

            case 2->{
                System.out.println("~~~~ 0--|=========> * <=========|--0 ~~~~");
                System.out.println("       Benvindo ao campo de batalha!     ");
                System.out.println("Esta preparado para conhecer seu oponente?");
                System.out.println("-----------------------------------------");

                Random aleatorio= new Random();
                int opcaoAlvo;

                opcaoAlvo = aleatorio.nextInt(3);

                switch (opcaoAlvo){
                    case 0 ->{
                        Mago inimigo = new Mago("bruxaria pura","mandinga severa", 10, "Mago");
                        operacao.batalha(container[0], inimigo);
                    }
                    case 1 ->{
                        Barbaro inimigo = new Barbaro("Devorador de almas", "abalo sismico", 40, "barbaro");
                        operacao.batalha(container[0], inimigo);
                    }
                    case 2 ->{
                        Paladino inimigo = new Paladino("bispo da meia noite", "Louvor estridente", 50, "paladino");
                        operacao.batalha(container[0], inimigo);
                    }
                }

            }

            case 3->{
                System.out.println("Ficha----------------------------");
                System.out.println("nome:"+ container[0].getNome());
                System.out.println("vida:"+ container[0].getVida());
                System.out.println("dano:"+ container[0].getDano());
                System.out.println("poder:"+ container[0].getPoder());
                System.out.println("---------------------------------");
            }

            case 4->{
                System.out.println("-'°'--'°'--'°'--'°'--'°'--'°'-");
                System.out.println(" Aqui se incerra sua jornada ");
                System.out.println("     Até logo guerreiro!     ");
                System.out.println("-'--'--'--'--'--'--'--'--'--'-");
            }
        }

      }while (option !=5);



    }

  public void upgrade(Guerreiro personagem, int optionClasse){

        Scanner input= new Scanner(System.in);
        int optionArtefatos= 0;
        int artefato1= 0;
        int artefato2= 0;
        int artefato3= 0;

        System.out.println("|Bem vindo ao mercado1!");
        System.out.println("|Contamos com uma variedade de produtos para sua jornada");

        switch (optionClasse) {
            case 1: //Mago
                System.out.println("| 1- Elixir de cura | +10 de vida");
                System.out.println("| 2- Cajado de fogo | +15 de dano");
                System.out.println("| 3- Cajado de gelo | +10 de dano");

                optionArtefatos = input.nextInt();
                input.nextLine();
                System.out.println(" ");

                artefato1 = 15;
                artefato2 = 15;
                artefato3 = 10;
                break;

            case 2: // Barbaro
                System.out.println("| 1- escudo de aço| +10 de vida");
                System.out.println("| 2- manopla de ouro | +25 de dano");
                System.out.println("| 3- machado de gelo | +30 de dano");

                optionArtefatos = input.nextInt();
                input.nextLine();
                System.out.println(" ");

                artefato1 = 10;
                artefato2 = 25;
                artefato3 = 30;

                break;

            case 3: //Paladino
                System.out.println("| 1- unção divina | +25 de vida");
                System.out.println("| 2- grimório sagrado | +40 de dano");
                System.out.println("| 3- crus de platina | +45 de dano");

                optionArtefatos = input.nextInt();
                input.nextLine();
                System.out.println(" ");

                artefato1 = 10;
                artefato2 = 40;
                artefato3 = 45;
        }


        switch (optionArtefatos) {
            case 1:
                personagem.setVida(personagem.getVida() + artefato1);
                System.out.println("+++vida");
                break;
            case 2:
                personagem.setDano(personagem.getDano() + artefato2);
                System.out.println("++Dano");
                break;
            case 3:
                personagem.setDano(personagem.getDano() + artefato3);
                System.out.println("+++Dano");
                break;
        }
        System.out.println(" ");
  }


  public void batalha(Guerreiro personagem, Guerreiro inimigo ){

      Random aleatorio= new Random();
      int iniciativa;

      //Barbaro inimigo = new Barbaro("Devorador de almas", "abalo sismico", 40, "barbaro");
      System.out.println("- seu inimigo serei eu:");
      System.out.println( inimigo.getNome() + " |" + inimigo.getVida() + " hp |" + inimigo.getDano() + " dano");
      System.out.println(" ");
      System.out.println("--- --- --- --- --- --- --- --- ---");
      System.out.println("Agora iremos saber quem irá atacar ");


      do {
          iniciativa = aleatorio.nextInt(2);

          switch (iniciativa) {
              case 0:
                  System.out.println("Sua vez:");
                  System.out.println( personagem.getPoder() + " !!!");
                  inimigo.setVida( inimigo.getVida() - personagem.getDano());

                  System.out.println( inimigo.getNome() + " | -" + personagem.getDano() + " hp");
                  System.out.println( inimigo.getNome() + " | " + inimigo.getVida() + " hp total");
                  System.out.println("---------------------------------------");
                  continue;

              case 1:
                  System.out.println( inimigo.getNome() + ":");
                  System.out.println( inimigo.getPoder() + " !!!");
                  personagem.setVida( personagem.getVida() - inimigo.getDano());

                  System.out.println("Você | -" + inimigo.getDano() + " hp");
                  System.out.println("Você | " + personagem.getVida() + " hp total");
                  System.out.println("---------------------------------------");
                  System.out.println(" ");
          }

      } while (inimigo.getVida() >= 0 && personagem.getVida() >= 0);



      if(personagem.getVida() > 0 ){
          System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
          System.out.println("Parabens você foi o vencedor do embate");
          System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
          System.out.println("recompensas: +vida e +dano");
          personagem.setVida(60);
          personagem.setDano( personagem.getDano() + 10);

      }else{
          System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
          System.out.println("        Parabens você Perdeu!        ");
          System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
          System.out.println(" ");
      }


  }
}
