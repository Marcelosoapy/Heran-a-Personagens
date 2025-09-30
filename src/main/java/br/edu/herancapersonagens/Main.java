import modelo.Barbaro;
import modelo.Mago;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
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
            case 1 -> {

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

                    case 2: // Barbaro
                        System.out.println("|Bem vindo ao mercado!");
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

                    /*case 3: //Paladino
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
                            b1= new Barbaro("Devorador de almas","abalo sismico",40,"barbaro");
                            System.out.println("- seu inimigo serei eu:");
                            System.out.println("Devorador de almas |"+b1.getVida()+" hp |"+b1.getDano()+" dano");
                            System.out.println(" ");
                            System.out.println("Agora iremos saber quem irá ter a atacar ");

                            do {
                                iniciativa= aleatorio.nextInt(2);
                                switch (iniciativa) {
                                    case 0:
                                        System.out.println("Sua vez:");
                                        System.out.println( m1.getPoder() + " !!!");
                                        b1.setVida( b1.getVida() - m1.getDano() );

                                        System.out.println("Devorador de almas | -" + m1.getDano() + " hp");
                                        System.out.println("Devorador de almas | " + b1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                        continue;

                                    case 1:
                                        System.out.println("Devorador de almas:");
                                        System.out.println(b1.getPoder() + " !!!");
                                        m1.setVida( m1.getVida() - b1.getDano() );

                                        System.out.println("Você | -" + b1.getDano() + " hp");
                                        System.out.println("Você | " + m1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                }

                            }while (m1.getVida() > 0 && b1.getVida() > 0);

                            if(m1.getVida() > 0 ){
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                                System.out.println("Parabens você foi o vencedor do embate");
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                                System.out.println("recompensas: +vida e +dano");
                                m1.setVida(60);
                                m1.setDano( m1.getDano() + 10);

                            }else{
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                                System.out.println("        Parabens você Perdeu!        ");
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                            }

                            continue;

                        case 1:
                            /*
                            b1= new Barbaro("Devorador de almas","abalo sismico",40,"barbaro");
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
                                        System.out.println( m1.getPoder() + " !!!");
                                        p1.setVida( p1.getVida() - m1.getDano() );

                                        System.out.println("bispo da meia noite | -" + m1.getDano() + " hp");
                                        System.out.println("bispo da meia noite | " + p1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");

                                        continue;

                                    case 1:
                                        System.out.println("bispo da meia noite:");
                                        System.out.println(p1.getPoder() + " !!!");
                                        m1.setVida( m1.getVida() - p1.getDano() );

                                        System.out.println("Você | -" + p1.getDano() + " hp");
                                        System.out.println("Você | " + m1.getVida() + " hp total");
                                        System.out.println("---------------------------------------");
                                }

                            }while (m1.getVida() > 0 && p1.getVida() > 0);

                            if(m1.getVida() > 0 ){
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                                System.out.println("Parabens você foi o vencedor do embate");
                                System.out.println("-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-'°*°'-");
                                System.out.println("recompensas: +vida e +dano");
                                m1.setVida(60);
                                m1.setDano( m1.getDano() + 10);

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
}
