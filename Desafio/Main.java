package NinvelItermediario.Desafio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int ninjasRegistrados = 0, quantidadeMaxima = 20;
        int opcao;
        Ninja[] ninjas = new Ninja[quantidadeMaxima];


        do {
            System.out.println("==== Sistema de Registros Ninjas ====");
            System.out.print("Digite a opção que deseja executar \n1. Registrar um Ninja. \n2. Registrar Missão " +
                    "\n3. Listar Ninjas. \n4. Excluir Ninja. \n5. Sair do menu. \n--> ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1://Registrar Ninja
                    if (ninjasRegistrados < quantidadeMaxima) {
                        System.out.print("Digite o nome do Ninja \n--> ");
                        String nome = sc.next();
                        sc.nextLine();
                        System.out.print("Digite a idade do Ninja \n--> ");
                        int idade = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Sexo do ninja \n--> ");
                        String sexo = sc.next();
                        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("masculino")){
                            sexo = "Masculino";
                        }
                        if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("feminino")){
                            sexo = "Feminino";
                        }

                        System.out.println("Este Ninja faz parte de algum clã que possui habilidade especial? (S / N)");
                        String resp = sc.next();
                        if (resp.equalsIgnoreCase("S") || resp.equalsIgnoreCase("Sim")){
                            System.out.print("Escolha o clan \n1. Uchiha \n2. Uzumaki \n3. Haruno \n--> ");
                            int decisao = sc.nextInt();
                            sc.nextLine();
                            switch (decisao) {
                                case 1:
                                    String habilidade = "Sharingan";
                                    Uchiha uchiha = new Uchiha(nome, idade, sexo, habilidade);
                                    ninjas[ninjasRegistrados] = uchiha;
                                    ninjasRegistrados++;
                                    System.out.println("Sucesso!");
                                break;
                                case 2:
                                    String habilidade2 = "Protagonismo";
                                    Uzumaki uzumaki = new Uzumaki(nome, idade, sexo, habilidade2);
                                    ninjas[ninjasRegistrados] = uzumaki;
                                    ninjasRegistrados++;
                                    System.out.println("Sucesso!");
                                    break;
                                    case 3:
                                        String habilidade3 = "Super cura e um pouco de inutilidade";
                                        Haruno haruno = new Haruno(nome, idade, sexo, habilidade3);
                                        ninjas[ninjasRegistrados] = haruno;
                                        ninjasRegistrados++;
                                        System.out.println("Sucesso!");
                                        break;
                                default:
                                    System.out.println("Opção invalidade, tente novamente.");
                                    break;
                            }
                        } else if (resp.equalsIgnoreCase("n") || resp.equalsIgnoreCase("não")) {
                            Ninja ninin = new Ninja(nome, idade, sexo);
                            ninjas[ninjasRegistrados] = ninin;
                            ninjasRegistrados++;
                            System.out.println("Sucesso!");
                        }
                    } else {
                        System.out.println("Quantidade máxima atingida");
                    }
                break;
                    case 2: //Registrar Missão
                        System.out.println("Registrar Missão");
                        System.out.print("Digite o nome do Ninja que deseja atribuir uma missão \n--> ");
                        String nome = sc.next();
                        sc.nextLine();

                        boolean ninjaEncontrado = false;
                        for (int i = 0; i < ninjas.length; i++) {
                            if (ninjas[i] != null && ninjas[i].getNome().equals(nome)) {
                                System.out.print("Digite o nome da missão \n--> ");
                                String missao = sc.nextLine();
                                System.out.print("Digite o nível de dificuldade ( S, A, B, C ou D ) \n--> ");
                                String dificuldade = sc.nextLine();
                                System.out.print("Digite o status da missão \n--> ");
                                String status = sc.nextLine();

                                ninjas[i].setMissao(missao);
                                ninjas[i].setNivelDificuldade(dificuldade);
                                ninjas[i].setStatusMissao(status);

                                ninjaEncontrado = true;
                                break;
                            }
                        }
                        if (!ninjaEncontrado) {
                            System.out.println("Ninja não encontrado");
                        }
                    break;
                        case 3: //Listar Ninja
                            if (ninjasRegistrados == 0 ){
                                System.out.println("Nenhum ninja registrado!");
                            } else {
                                System.out.println("\n\nNinjas Registrados");
                                for (int i = 0; i < ninjas.length; i++) {
                                    if (ninjas[i] != null) {
                                        System.out.println("=================");
                                        ninjas[i].mostrarInformacoes();
                                        System.out.println("=================");
                                    }
                                }
                            }
                            break;
                        case 4://Remover Ninja
                            if ( ninjasRegistrados == 0){
                                System.out.println("Lista vazia");
                            } else {
                                System.out.println("Excluir Ninja");
                                System.out.print("Digite o nome do Ninja que deseja excluir \n--> ");
                                String nomeExcluir = sc.next();
                                sc.nextLine();

                                boolean nomeEncontrado = false;
                                for ( int i = 0 ; i < ninjas.length; i++){
                                    if (ninjas[i] != null && ninjas[i].getNome().equals(nomeExcluir)) {
                                        ninjas[i] = null;
                                        ninjasRegistrados--;
                                        nomeEncontrado = true;
                                        System.out.println("Ninja Removido com sucesso");
                                        break;
                                    }
                                }
                                if (!nomeEncontrado) {
                                    System.out.println("Ninja não encontrado.");
                                }
                            }
                        break;
                            case 5:
                                System.out.println("Saindo...");
                                break;
                default:
                    System.out.println("Opção Invalida");
                    break;
            }



        } while (opcao != 5);











        sc.close();
    }
}
