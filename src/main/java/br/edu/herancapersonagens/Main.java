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
            case 1 -> {

                switch (optionClasse){
                    case 1:
                        operacao.upgrade(m1, optionClasse);
                        continue;
                    case 2:
                        operacao.upgrade(b1, optionClasse);
                        continue;
                    /*case 3:
                        operacao.upgrade(p1, optionClasse);
                        continue;*/
                }

            } // upgrades

            case 2->{
                System.out.println("~~~~ 0--|=========> * <=========|--0 ~~~~");
                System.out.println("       Benvindo ao campo de batalha!     ");
                System.out.println("Esta preparado para conhecer seu oponente?");
                System.out.println("-----------------------------------------");


                Random aleatorio= new Random();
                int alvo;
                int iniciativa;

                if(optionClasse == 1) { //mago
                    alvo = aleatorio.nextInt(2);

                    switch (alvo){
                        case 0:
                            personagem= new Barbaro("Devorador de almas","abalo sismico",40,"barbaro");
                            System.out.println("- seu inimigo serei eu:");
                            System.out.println("Devorador de almas |"+personagem.getVida()+" hp |"+personagem.getDano()+" dano");
                            System.out.println(" ");
                            System.out.println("Agora iremos saber quem irá ter a atacar ");

                            do {
                                iniciativa= aleatorio.nextInt(2);
                                switch (iniciativa) {
                                    case 0:
                                        System.out.println("Sua vez:");
                                        System.out.println( personagem.getPoder() + " !!!");
                                        personagem.setVida( personagem.getVida() - personagem.getDano() );

                                        System.out.println("Devorador de almas | -" + personagem.getDano() + " hp");
                                        System.out.println("Devorador de almas | " + personagem.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                        continue;

                                    case 1:
                                        System.out.println("Devorador de almas:");
                                        System.out.println(personagem.getPoder() + " !!!");
                                        personagem.setVida( personagem.getVida() - personagem.getDano() );

                                        System.out.println("Você | -" + personagem.getDano() + " hp");
                                        System.out.println("Você | " + personagem.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                }

                            }while (personagem.getVida() > 0 && personagem.getVida() > 0);

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
                            }

                            continue;

                        case 1:
                            /*
                            personagem= new Barbaro("Devorador de almas","abalo sismico",40,"barbaro");
                            p1= new Paladino("bispo da meia noite","Louvor estridente",50,"paladino");
                            System.out.println("- seu inimigo serei eu:");
                            System.out.println("bispo da meia noite |"+p1.getVida()+" hp |"+p1.getDano()+" dano");
                            System.out.println(" ");
                            System.out.println("Agora iremos saber quem irá ter a atacar ");

                            do {
                                iniciativa= aleatorio.nextInt(2);
                                switch (iniciativa) {
                                    case 0:
                                        System.out.println("Sua vez:");
                                        System.out.println( personagem.getPoder() + " !!!");
                                        p1.setVida( p1.getVida() - personagem.getDano() );

                                        System.out.println("bispo da meia noite | -" + personagem.getDano() + " hp");
                                        System.out.println("bispo da meia noite | " + p1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");

                                        continue;

                                    case 1:
                                        System.out.println("bispo da meia noite:");
                                        System.out.println(p1.getPoder() + " !!!");
                                        personagem.setVida( personagem.getVida() - p1.getDano() );

                                        System.out.println("Você | -" + p1.getDano() + " hp");
                                        System.out.println("Você | " + personagem.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                }

                            }while (personagem.getVida() > 0 && p1.getVida() > 0);

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
                            }
                            */
                    }

                } else if (optionClasse == 2) {

                }

            }

            case 3->{

            }

            case 4->{}

            case 5->{}
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

  }


  public void batalha(Guerreiro personagem){

      System.out.println("~~~~ 0--|=========> * <=========|--0 ~~~~");
      System.out.println("       Benvindo ao campo de batalha!     ");
      System.out.println("Esta preparado para conhecer seu oponente?");
      System.out.println("-----------------------------------------");


      Random aleatorio= new Random();
      int opcaoAlvo;
      int iniciativa;

      if(personagem.getClasse().contains("Mago")) { //mago
          opcaoAlvo = aleatorio.nextInt(2);

          switch (opcaoAlvo){
              case 0:
                  Barbaro inimigo= new Barbaro("Devorador de almas","abalo sismico",40,"barbaro");
                  System.out.println("- seu inimigo serei eu:");
                  System.out.println("Devorador de almas |"+inimigo.getVida()+" hp |"+inimigo.getDano()+" dano");
                  System.out.println(" ");
                  System.out.println("Agora iremos saber quem irá ter a atacar ");

                  do {
                      iniciativa= aleatorio.nextInt(2);

                      switch (iniciativa) {
                          case 0:
                              System.out.println("Sua vez:");
                              System.out.println( personagem.getPoder() + " !!!");
                              inimigo.setVida( inimigo.getVida() - personagem.getDano() );

                              System.out.println("Devorador de almas | -" + inimigo.getDano() + " hp");
                              System.out.println("Devorador de almas | " + inimigo.getVida() + " hp total");
                              System.out.println("---------------------------------------");
                              continue;

                          case 1:
                              System.out.println("Devorador de almas:");
                              System.out.println(inimigo.getPoder() + " !!!");
                              personagem.setVida( personagem.getVida() - inimigo.getDano() );

                              System.out.println("Você | -" + personagem.getDano() + " hp");
                              System.out.println("Você | " + personagem.getVida() + " hp total");
                              System.out.println("---------------------------------------");
                      }

                  }while (inimigo.getVida() >= 0 && personagem.getVida() >= 0);

                  if(inimigo.getVida() >= 0 ){
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
                  }

                  break;

              case 1:

                            alvo= new Paladino("bispo da meia noite","Louvor estridente",50,"paladino");
                            System.out.println("- seu inimigo serei eu:");
                            System.out.println("bispo da meia noite |"+alvo.getVida()+" hp |"+alvo.getDano()+" dano");
                            System.out.println(" ");
                            System.out.println("Agora iremos saber quem irá ter a atacar ");

                            do {
                                iniciativa= aleatorio.nextInt(2);
                                switch (iniciativa) {
                                    case 0:
                                        System.out.println("Sua vez:");
                                        System.out.println( personagem.getPoder() + " !!!");
                                        p1.setVida( p1.getVida() - personagem.getDano() );

                                        System.out.println("bispo da meia noite | -" + personagem.getDano() + " hp");
                                        System.out.println("bispo da meia noite | " + p1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");

                                        continue;

                                    case 1:
                                        System.out.println("bispo da meia noite:");
                                        System.out.println(p1.getPoder() + " !!!");
                                        personagem.setVida( personagem.getVida() - p1.getDano() );

                                        System.out.println("Você | -" + p1.getDano() + " hp");
                                        System.out.println("Você | " + personagem.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                }

                            }while (personagem.getVida() > 0 && p1.getVida() > 0);

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
                            }
                            */
          }

      } else if (optionClasse == 2) {

      }

  }
}
