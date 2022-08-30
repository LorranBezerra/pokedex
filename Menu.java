

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {

    List<Pessoas> pessoas = new ArrayList<>();
    List<Animal> animal = new ArrayList<>();
    List<Lugar> lugar = new ArrayList<>();
    List<Musica> musica = new ArrayList<>();
    Scanner info = new Scanner(System.in);
    int opcao;

    public void menuPrincipal() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##------ MENU PRINCIPAL -----##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Menu de registro        |");
        System.out.println("| 2 - Enviar Mensagem         |");
        System.out.println("| 3 - Jogar                   |");
        System.out.println("| 4 - Sair                    |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                menuRegistro();
                break;
            case 2:
                enviarMensagem();
                break;
            case 3:
                menuJogo();
                break;
            case 4:
                System.out.println("Até logo");
                break;
            default:
                System.out.println("Opção invalida");
                menuPrincipal();
        }

    }

    public void menuRegistro() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##---- MENU DE REGISTRO -----##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Registro de pessoas     |");
        System.out.println("| 2 - Registro de animais     |");
        System.out.println("| 3 - Registro de lugares     |");
        System.out.println("| 4 - Registro de musicas     |");
        System.out.println("| 5 - Voltar                    |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                menuPessoas();
                break;
            case 2:
                menuAnimal();
                break;
            case 3:
                menuLugares();
                break;
            case 4:
                menuMusica();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção invalida");
                menuPrincipal();
        }
    }

    public void menuPessoas() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##--- REGISTRO DE PESSOAS ---##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Adicionar               |");
        System.out.println("| 2 - Editar                  |");
        System.out.println("| 3 - Buscar                  |");
        System.out.println("| 4 - Excluir                 |");
        System.out.println("| 5 - Voltar                  |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                adicionarPessoas();
                break;
            case 2:
                editarPessoas();
                break;
            case 3:
                buscarPessoas();
                break;
            case 4:
                excluirPessoas();
                break;
            case 5:
                menuRegistro();
                break;
            default:
                System.out.println("Opção invalida");
                menuPessoas();
        }
    }

    public void adicionarPessoas() {
        Pessoas p = new Pessoas();
        Scanner addpe = new Scanner(System.in);
        System.out.println("Digite um nome:");
        p.setNome(addpe.nextLine());
        System.out.println("Digite uma idade:");
        p.setIdade(addpe.nextInt());
        addpe.nextLine();
        System.out.println("Digite uma data de aniversario:");
        p.setAniversario(addpe.nextLine());
        System.out.println("Digite um numero de telefone:");
        p.setTelefone(addpe.nextInt());
        System.out.println("Digite o sexo da pessoa:");
        p.setGenero(addpe.next());
        addpe.nextLine();
        System.out.println("Digite um hobby:");
        p.setHobby(addpe.nextLine());
        System.out.println("Digite a comida favorita dele(a):");
        p.setComidaFavorita(addpe.nextLine());
        System.out.println("Digite o que ele(a) mais gosta de fazer:");
        p.setCoisasFavorita(addpe.nextLine());
        System.out.println("Digite o que ele(a) mais odeia:");
        p.setCoisasQueOdeia(addpe.nextLine());
        System.out.println("Digite o que você pensa sobre ele(a):");
        p.setObservacao(addpe.nextLine());
        pessoas.add(p);
        menuPessoas();

    }

    public void editarPessoas() {
        Pessoas p = new Pessoas();
        Scanner addpe = new Scanner(System.in);
        System.out.println("Digite um nome:");
        p.setNome(addpe.nextLine());
        System.out.println("Digite uma idade:");
        p.setIdade(addpe.nextInt());
        addpe.nextLine();
        System.out.println("Digite uma data de aniversario:");
        p.setAniversario(addpe.nextLine());
        System.out.println("Digite um numero de telefone:");
        p.setTelefone(addpe.nextInt());
        System.out.println("Digite o sexo da pessoa:");
        p.setGenero(addpe.next());
        addpe.nextLine();
        System.out.println("Digite um hobby:");
        p.setHobby(addpe.nextLine());
        System.out.println("Digite a comida favorita dele(a):");
        p.setComidaFavorita(addpe.nextLine());
        System.out.println("Digite o que ele(a) mais gosta de fazer:");
        p.setCoisasFavorita(addpe.nextLine());
        System.out.println("Digite o que ele(a) mais odeia:");
        p.setCoisasQueOdeia(addpe.nextLine());
        System.out.println("Digite o que você pensa sobre ele(a):");
        p.setObservacao(addpe.nextLine());
        System.out.println("|-----------------------------|");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Sexo: " + p.getGenero());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Aniversario:" + p.getAniversario());
        System.out.println("Telefone: " + p.getTelefone());
        System.out.println("Hobby: " + p.getHobby());
        System.out.println("Comida favorita: " + p.getComidaFavorita());
        System.out.println("Gosta: " + p.getCoisasFavorita());
        System.out.println("Odeia: " + p.getCoisasQueOdeia());
        System.out.println("Observação: " + p.getObservacao());

        System.out.print("|-----------------------------|\n");
        System.out.println("Digite o indice que você quer altera");
        int indice = info.nextInt();
        pessoas.set(indice, p);
        System.out.println("Alterado com sucesso");
        menuPessoas();
    }

    public void buscarPessoas() {
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Procurar por nome       |");
        System.out.println("| 2 - Ver todos               |");
        System.out.println("| 3 - Voltar                  |");
        System.out.println("|-----------------------------|");
        System.out.println("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                procurarPessoas();
                break;
            case 2:
                todasPessoas();
                break;
            case 3:
                menuPessoas();
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                buscarPessoas();
        }
    }

    public void procurarPessoas() {
        System.out.println("Digite o nome da pessoa: ");
        Scanner bp = new Scanner(System.in);
        String pessoa;
        pessoa = bp.nextLine();
        for (Pessoas p : pessoas) {
            if (pessoa.equals(p.getNome())) {
                System.out.println("Nome: " + p.getNome());
                System.out.println("Sexo: " + p.getGenero());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("Aniversario: " + p.getAniversario());
                System.out.println("Telefone: " + p.getTelefone());
                System.out.println("Hobby: " + p.getHobby());
                System.out.println("Comida favorita: " + p.getComidaFavorita());
                System.out.println("Gosta: " + p.getCoisasFavorita());
                System.out.println("Odeia: " + p.getCoisasQueOdeia());
                System.out.println("Observação: " + p.getObservacao());
                System.out.println("----------------------------------");
                buscarPessoas();
            }
        }
        System.out.println("Nome não encontrado");
        buscarPessoas();
    }

    public void todasPessoas() {
        for (Pessoas p : pessoas) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Sexo: " + p.getGenero());
            System.out.println("Idade: " + p.getIdade());
            System.out.println("Aniversario:" + p.getAniversario());
            System.out.println("Telefone: " + p.getTelefone());
            System.out.println("Hobby: " + p.getHobby());
            System.out.println("Comida favorita: " + p.getComidaFavorita());
            System.out.println("Gosta: " + p.getCoisasFavorita());
            System.out.println("Odeia: " + p.getCoisasQueOdeia());
            System.out.println("Observação: " + p.getObservacao());
            System.out.println("----------------------------------");

        }
        buscarPessoas();
    }

    public void excluirPessoas() {

        System.out.println("Digite o indice que deseja excluir");
        int indice = info.nextInt();
        System.out.println("Deseja realmente excluir essa pessoa?");
        System.out.println("| 1 - Sim |");
        System.out.println("| 2 - Não |");
        Scanner remover = new Scanner(System.in);
        opcao = remover.nextInt();
        switch (opcao) {
            case 1:
                pessoas.remove(indice);
                System.out.println("Excluido com sucesso");
                menuRegistro();
                break;
            case 2:
                menuPessoas();
                break;
            default:
                System.out.println("Opção invalida");
                excluirPessoas();
        }

    }

    public void menuAnimal() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##--- REGISTRO DE ANIMAL ----##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Adicionar               |");
        System.out.println("| 2 - Editar                  |");
        System.out.println("| 3 - Buscar                  |");
        System.out.println("| 4 - Excluir                 |");
        System.out.println("| 5 - Voltar                  |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                adicionarAnimal();
                break;
            case 2:
                editarAnimal();
                break;
            case 3:
                buscarAnimal();
                break;
            case 4:
                excluirAnimal();
                break;
            case 5:
                menuRegistro();
                break;
            default:
                System.out.println("Opção invalida");
                menuAnimal();
        }
    }

    public void adicionarAnimal() {
        Animal a = new Animal();
        Scanner adan = new Scanner(System.in);
        System.out.println("Digite um nome:");
        a.setNome(adan.nextLine());
        System.out.println("Digite o nome da espécie:");
        a.setEspecie(adan.nextLine());
        System.out.println("Digite o peso da espécie:");
        a.setPeso(adan.nextDouble());
        adan.nextLine();
        System.out.println("Digite o local da especie encontrada");
        a.setLocal(adan.nextLine());
        System.out.println("Digite o tipo de comida que ele come:");
        a.setAlimentacao(adan.nextLine());
        System.out.println("Digite a descrição do animal:");
        a.setCaracteristicas(adan.nextLine());
        animal.add(a);
        menuAnimal();
    }

    public void editarAnimal() {
        Animal a = new Animal();
        Scanner adan = new Scanner(System.in);
        System.out.println("Digite um nome:");
        a.setNome(adan.nextLine());
        System.out.println("Digite o nome da espécie:");
        a.setEspecie(adan.nextLine());
        System.out.println("Digite o peso da espécie:");
        a.setPeso(adan.nextDouble());
        adan.nextLine();
        System.out.println("Digite o local da especie encontrada");
        a.setLocal(adan.nextLine());
        System.out.println("Digite o tipo de comida que ele come:");
        a.setAlimentacao(adan.nextLine());
        System.out.println("Digite a descrição do animal:");
        a.setCaracteristicas(adan.nextLine());
        System.out.println("|-----------------------------|");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Espécie: " + a.getEspecie());
        System.out.println("Peso: " + a.getPeso());
        System.out.println("Localização:" + a.getLocal());
        System.out.println("Alimento: " + a.getAlimentacao());
        System.out.println("Descrição: " + a.getCaracteristicas());
        System.out.println("|-----------------------------|");
        System.out.println("Digite o indice que você quer altera");
        int indice = info.nextInt();
        animal.set(indice, a);
        System.out.println("Alterado com sucesso");
        menuAnimal();
    }

    public void buscarAnimal() {
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Procurar por nome       |");
        System.out.println("| 2 - Procurar por especie    |");
        System.out.println("| 3 - Ver todos               |");
        System.out.println("| 4 - Voltar                  |");
        System.out.println("|-----------------------------|");
        System.out.println("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                procurarAnimal();
                break;
            case 2:
                procurarAnimalEspecie();
                break;
            case 3:
                verTodosAnimais();
                break;
            case 4:
                menuAnimal();
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                buscarAnimal();
        }
    }

    public void procurarAnimal() {
        System.out.println("Digite o nome do animal: ");
        Scanner pa = new Scanner(System.in);
        String panimal;
        panimal = pa.nextLine();
        for (Animal a : animal) {
            if (panimal.equals(a.getNome())) {
                System.out.println("Nome: " + a.getNome());
                System.out.println("Espécie: " + a.getEspecie());
                System.out.println("Peso: " + a.getPeso());
                System.out.println("Localização:" + a.getLocal());
                System.out.println("Alimento: " + a.getAlimentacao());
                System.out.println("Descrição: " + a.getCaracteristicas());
                System.out.println("----------------------------------");
                buscarAnimal();
            }
        }
        System.out.println("Nome não encontrado");
        buscarAnimal();
    }

    public void procurarAnimalEspecie() {
        System.out.println("Digite o nome da especie: ");
        Scanner psa = new Scanner(System.in);
        String pspanimal;
        pspanimal = psa.nextLine();
        for (Animal a : animal) {
            if (pspanimal.equals(a.getEspecie())) {
                System.out.println("Nome: " + a.getNome());
                System.out.println("Espécie: " + a.getEspecie());
                System.out.println("Peso: " + a.getPeso());
                System.out.println("Localização:" + a.getLocal());
                System.out.println("Alimento: " + a.getAlimentacao());
                System.out.println("Descrição: " + a.getCaracteristicas());
                System.out.println("----------------------------------");
            }

        }
        buscarAnimal();
    }

    public void verTodosAnimais() {
        for (Animal a : animal) {
            System.out.println("Nome: " + a.getNome());
            System.out.println("Espécie: " + a.getEspecie());
            System.out.println("Peso: " + a.getPeso());
            System.out.println("Localização:" + a.getLocal());
            System.out.println("Alimento: " + a.getAlimentacao());
            System.out.println("Descrição: " + a.getCaracteristicas());
            System.out.println("----------------------------------");
        }
        buscarAnimal();
    }

    public void excluirAnimal() {
        System.out.println("Digite o indice que deseja excluir");
        int indice = info.nextInt();
        System.out.println("Deseja realmente excluir esse animal?");
        System.out.println("| 1 - Sim |");
        System.out.println("| 2 - Não |");
        Scanner remover = new Scanner(System.in);
        opcao = remover.nextInt();
        switch (opcao) {
            case 1:
                animal.remove(indice);
                System.out.println("Excluido com sucesso");
                menuRegistro();
                break;
            case 2:
                menuAnimal();
                break;
            default:
                System.out.println("Opção invalida");
                excluirAnimal();
        }
    }

    public void menuLugares() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##--- REGISTRO DE LUGARES ---##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Adicionar               |");
        System.out.println("| 2 - Editar                  |");
        System.out.println("| 3 - Buscar                  |");
        System.out.println("| 4 - Excluir                 |");
        System.out.println("| 5 - Menu principal          |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                adicionarLugar();
                break;
            case 2:
                editarLugar();
                break;
            case 3:
                buscarLugar();
                break;
            case 4:
                excluirLugar();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção invalida");
                menuLugares();
        }
    }

    public void adicionarLugar() {
        Lugar l = new Lugar();
        Scanner addl = new Scanner(System.in);
        System.out.println("Digite o nome do local:");
        l.setNome(addl.nextLine());
        System.out.println("Digite o tipo do local:");
        l.setTipo(addl.nextLine());
        System.out.println("Digite o nome da rua:");
        l.setRua(addl.nextLine());
        System.out.println("Digite o numero do local:");
        l.setNumeroRua(addl.nextLine());
        System.out.println("Digite o bairro do local:");
        l.setBairro(addl.nextLine());
        System.out.println("Digite o que você pensa sobre o lugar:");
        l.setDescricao(addl.nextLine());
        lugar.add(l);
        menuLugares();
    }

    public void editarLugar() {
        Lugar l = new Lugar();
        Scanner addl = new Scanner(System.in);
        System.out.println("Digite o nome do local:");
        l.setNome(addl.nextLine());
        System.out.println("Digite o tipo do local:");
        l.setTipo(addl.nextLine());
        System.out.println("Digite o nome da rua:");
        l.setRua(addl.nextLine());
        System.out.println("Digite o numero do local:");
        l.setNumeroRua(addl.nextLine());
        System.out.println("Digite o bairro do local:");
        l.setBairro(addl.nextLine());
        System.out.println("Digite o que você pensa sobre o lugar:");
        l.setDescricao(addl.nextLine());
        System.out.println("|-----------------------------|");

        System.out.println("Nome: " + l.getNome());
        System.out.println("Tipo de lugar: " + l.getTipo());
        System.out.println("Endereço");
        System.out.println("|-----------------------------|");
        System.out.println("Rua:" + l.getRua());
        System.out.println("Numero: " + l.getNumeroRua());
        System.out.println("Bairro: " + l.getBairro());
        System.out.println("|-----------------------------|");
        System.out.println("Descrição: " + l.getDescricao());

        System.out.print("|-----------------------------|\n");
        System.out.println("Digite o indice que você quer altera");
        int indice = info.nextInt();
        lugar.set(indice, l);
        System.out.println("Alterado com sucesso");
        menuLugares();

    }

    public void buscarLugar() {
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Procurar por nome       |");
        System.out.println("| 2 - Procurar por tipo       |");
        System.out.println("| 3 - Ver todos lugares salvo |");
        System.out.println("| 4 - Voltar |");
        System.out.println("|-----------------------------|");
        System.out.println("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                procurarNomeLugar();
                break;
            case 2:
                procurarTipoLugar();
                break;
            case 3:
                verTodosLugares();
                break;
            case 4:
                menuLugares();
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                buscarLugar();
        }
    }

    public void procurarNomeLugar() {
        System.out.println("Digite o nome do local: ");
        Scanner bl = new Scanner(System.in);
        String blugar;
        blugar = bl.nextLine();
        for (Lugar l : lugar) {
            if (blugar.equals(l.getNome())) {
                System.out.println("Nome: " + l.getNome());
                System.out.println("Tipo de lugar: " + l.getTipo());
                System.out.println("Endereço");
                System.out.println("|-----------------------------|");
                System.out.println("Rua:" + l.getRua());
                System.out.println("Numero: " + l.getNumeroRua());
                System.out.println("Bairro: " + l.getBairro());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + l.getDescricao());
                System.out.println("----------------------------------");
                buscarLugar();
            }
        }
        System.out.println("Lugar não encontrado");
        buscarLugar();
    }

    public void procurarTipoLugar() {
        System.out.println("Digite o tipo do local: ");
        Scanner lu = new Scanner(System.in);
        String local;
        local = lu.nextLine();
        for (Lugar l : lugar) {
            if (local.equals(l.getTipo())) {
                System.out.println("Nome: " + l.getNome());
                System.out.println("Tipo de lugar: " + l.getTipo());
                System.out.println("Endereço");
                System.out.println("|-----------------------------|");
                System.out.println("Rua:" + l.getRua());
                System.out.println("Numero: " + l.getNumeroRua());
                System.out.println("Bairro: " + l.getBairro());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + l.getDescricao());

            }
        }
        buscarLugar();
    }

    public void verTodosLugares() {
        for (Lugar l : lugar) {
            System.out.println("Nome: " + l.getNome());
            System.out.println("Tipo de lugar: " + l.getTipo());
            System.out.println("Endereço");
            System.out.println("|-----------------------------|");
            System.out.println("Rua:" + l.getRua());
            System.out.println("Numero: " + l.getNumeroRua());
            System.out.println("Bairro: " + l.getBairro());
            System.out.println("|-----------------------------|");
            System.out.println("Descrição: " + l.getDescricao());
            System.out.println("----------------------------------");

        }
        buscarLugar();
    }

    public void excluirLugar() {
        System.out.println("Digite o indice que deseja excluir");
        int indice = info.nextInt();
        System.out.println("Deseja realmente excluir essa pessoa?");
        System.out.println("| 1 - Sim |");
        System.out.println("| 2 - Não |");
        Scanner remover = new Scanner(System.in);
        opcao = remover.nextInt();
        switch (opcao) {
            case 1:
                lugar.remove(indice);
                System.out.println("Excluido com sucesso");
                menuPrincipal();
                break;
            case 2:
                menuPessoas();
                break;
            default:
                System.out.println("Opção invalida");
                excluirPessoas();
        }
    }

    public void menuMusica() {
        System.out.print("\n|-----------------------------|\n");
        System.out.println("##--- REGISTRO DE MUSICA ----##");
        System.out.println("|-----------------------------|");
        System.out.println("| 1 - Adicionar               |");
        System.out.println("| 2 - Editar                  |");
        System.out.println("| 3 - Buscar                  |");
        System.out.println("| 4 - Excluir                 |");
        System.out.println("| 5 - Menu principal          |");
        System.out.println("|-----------------------------|");
        System.out.print("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                adicionarMusica();
                break;
            case 2:
                editarMusica();
                break;
            case 3:
                buscarMusica();
                break;
            case 4:
                excluirMusica();
                break;
            case 5:
                menuPrincipal();
                break;
            default:
                System.out.println("Opção invalida");
                menuMusica();
        }
    }

    public void adicionarMusica() {
        Musica m = new Musica();
        Scanner addm = new Scanner(System.in);
        System.out.println("Digite o estilo da musica:");
        m.setEstilo(addm.nextLine());
        System.out.println("Digite o nome da musica:");
        m.setNome(addm.nextLine());
        System.out.println("Digite o nome do cantor:");
        m.setCantor(addm.nextLine());
        System.out.println("Digite o nome da banda:");
        m.setBanda(addm.nextLine());
        System.out.println("Digite o que você pensa sobre essa musica:");
        m.setDescricao(addm.nextLine());
        musica.add(m);
        menuMusica();
    }

    public void editarMusica() {
        Musica m = new Musica();
        Scanner addm = new Scanner(System.in);
        System.out.println("Digite o estilo da musica:");
        m.setEstilo(addm.nextLine());
        System.out.println("Digite o nome da musica:");
        m.setNome(addm.nextLine());
        System.out.println("Digite o nome do cantor:");
        m.setCantor(addm.nextLine());
        System.out.println("Digite o nome da banda:");
        m.setBanda(addm.nextLine());
        System.out.println("Digite o que você pensa sobre essa musica:");
        m.setDescricao(addm.nextLine());
        System.out.println("|-----------------------------|");
        System.out.println("Nome:" + m.getNome());
        System.out.println("Estilo: " + m.getEstilo());
        System.out.println("Banda: " + m.getBanda());
        System.out.println("Cantor: " + m.getCantor());
        System.out.println("|-----------------------------|");
        System.out.println("Descrição: " + m.getDescricao());
        System.out.println("|-----------------------------|");
        System.out.println("Digite o indice que você quer altera");
        int indice = info.nextInt();
        musica.set(indice, m);
        System.out.println("Alterado com sucesso");

    }

    public void buscarMusica() {
        System.out.println("|---------------------------------|");
        System.out.println("| 1 - Procurar por nome           |");
        System.out.println("| 2 - Procurar por estilo         |");
        System.out.println("| 3 - Procurar por banda          |");
        System.out.println("| 4 - Procurar por cantor         |");
        System.out.println("| 5 - Ver todas as musicas salvas |");
        System.out.println("| 6 - Voltar                      |");
        System.out.println("|---------------------------------|");
        System.out.println("Digite uma opção: ");
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                procurarNomeMusica();
                break;
            case 2:
                procurarTipoMusica();
                break;
            case 3:
                procurarBandaMusica();
                break;
            case 4:
                procurarCantorMusica();
                break;
            case 5:
                verTodasMusicas();
                break;
            case 6:
                menuMusica();
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                buscarLugar();
        }

    }

    public void procurarNomeMusica() {

        System.out.println("Digite o nome da musica: ");
        Scanner nm = new Scanner(System.in);
        String music;
        music = nm.nextLine();
        for (Musica m : musica) {
            if (music.equals(m.getNome())) {
                System.out.println("Nome:" + m.getNome());
                System.out.println("Estilo: " + m.getEstilo());
                System.out.println("Banda: " + m.getBanda());
                System.out.println("Cantor: " + m.getCantor());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("----------------------------------");
                buscarMusica();
            }
        }
        System.out.println("Musica não encontrado");
        buscarMusica();
    }

    public void procurarTipoMusica() {
        System.out.println("Digite o estilo da musica: ");
        Scanner tm = new Scanner(System.in);
        String music;
        music = tm.nextLine();
        for (Musica m : musica) {
            if (music.equals(m.getEstilo())) {
                System.out.println("Nome:" + m.getNome());
                System.out.println("Estilo: " + m.getEstilo());
                System.out.println("Banda: " + m.getBanda());
                System.out.println("Cantor: " + m.getCantor());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("----------------------------------");
            }
        }
        buscarMusica();
    }

    public void procurarBandaMusica() {
        System.out.println("Digite o nome da banda: ");
        Scanner bdm = new Scanner(System.in);
        String music;
        music = bdm.nextLine();
        for (Musica m : musica) {
            if (music.equals(m.getBanda())) {
                System.out.println("Nome:" + m.getNome());
                System.out.println("Estilo: " + m.getEstilo());
                System.out.println("Banda: " + m.getBanda());
                System.out.println("Cantor: " + m.getCantor());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("----------------------------------");
            }
        }
        buscarMusica();
    }

    public void procurarCantorMusica() {
        System.out.println("Digite o nome do Cantor(a): ");
        Scanner cm = new Scanner(System.in);
        String music;
        music = cm.nextLine();
        for (Musica m : musica) {
            if (music.equals(m.getCantor())) {
                System.out.println("Nome:" + m.getNome());
                System.out.println("Estilo: " + m.getEstilo());
                System.out.println("Banda: " + m.getBanda());
                System.out.println("Cantor: " + m.getCantor());
                System.out.println("|-----------------------------|");
                System.out.println("Descrição: " + m.getDescricao());
                System.out.println("----------------------------------");
            }
        }
        buscarMusica();
    }

    public void verTodasMusicas() {
        for (Musica m : musica) {
            System.out.println("Nome:" + m.getNome());
            System.out.println("Estilo: " + m.getEstilo());
            System.out.println("Banda: " + m.getBanda());
            System.out.println("Cantor: " + m.getCantor());
            System.out.println("|-----------------------------|");
            System.out.println("Descrição: " + m.getDescricao());
            System.out.println("----------------------------------");

        }
        buscarMusica();
    }

    public void excluirMusica() {

        System.out.println("Digite o indice que deseja excluir");
        int indice = info.nextInt();
        System.out.println("Deseja realmente excluir essa musica?");
        System.out.println("| 1 - Sim |");
        System.out.println("| 2 - Não |");
        Scanner remover = new Scanner(System.in);
        opcao = remover.nextInt();
        switch (opcao) {
            case 1:
                musica.remove(indice);
                System.out.println("Excluido com sucesso");
                menuPrincipal();
                break;
            case 2:
                menuMusica();
                break;
            default:
                System.out.println("Opção invalida");
                excluirMusica();
        }
    }

    public void enviarMensagem() {
        System.out.println("Para quem você quer enviar uma mensagem: ");
        Scanner np = new Scanner(System.in);
        String nomepessoas;
        nomepessoas = np.next();
        for (Pessoas p : pessoas) {
            if (nomepessoas.equals(p.getNome())) {
                System.out.println("Digite sua mensagem: ");
                Scanner recado = new Scanner(System.in);
                p.setMensagem(recado.nextLine());
                System.out.println("Deseja enviar essa mensagem?: ");
                System.out.println("| 1 - Sim |");
                System.out.println("| 2 - Não |");
                opcao = info.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println("Mensagem enviada");
                        System.out.println("Para: " + p.getNome());
                        System.out.println("Mensagem: " + p.getMensagem());
                        menuPrincipal();
                        break;
                    case 2:
                        menuPrincipal();
                        break;
                    default:
                        System.out.println("Opção invalida");
                        enviarMensagem();
                }

            }

        }
        System.out.println("Nome não encontrado");
        menuPrincipal();

    }

    public void menuJogo() {
        System.out.print("##--Nivel do jogo--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Facil |\n");
        System.out.print("| 2 - Dificil |\n");
        System.out.print("| 3 - Voltar |\n");
        System.out.print("Digite uma opção: ");
        Scanner info = new Scanner(System.in);
        opcao = info.nextInt();
        switch (opcao) {
            case 1:
                jogoeasy();
                break;
            case 2:
                jogohard();
                break;
            case 3:
                menuPrincipal();
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                menuJogo();
        }

    }

    public void jogoeasy() {
       
        int oponente;
        int voce;
        System.out.print("\n##--Digite uma opção--##\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Pedra |\n");
        System.out.print("| 2 - Papel |\n");
        System.out.print("| 3 - Tesoura |\n");
        System.out.print("| 4 - Sair do jogo |\n");
       Scanner play = new Scanner(System.in);
        voce = play.nextInt();
        Random gerador = new Random();
        oponente = gerador.nextInt(3);
        switch (voce) {
            case 1:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n o Jogo empatou");
                        jogoeasy();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Papel cobre pedra\n Você perdeu");
                        jogoeasy();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Pedra amassa tesoura\n Você ganhou");
                        jogoeasy();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogoeasy();
                        break;
                }
                break;

            case 2:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Papel cobre pedra\n Você ganhou");
                        jogoeasy();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n o Jogo empatou");
                        jogoeasy();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Tesoura corta papel\n Você perdeu");
                        jogoeasy();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogoeasy();
                        break;
                }

                break;

            case 3:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Pedra amassa tesoura\n Você perdeu");
                        jogoeasy();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Tesoura corta papel \n Você ganhou");
                        jogoeasy();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura, o Jogo empatou");
                        jogoeasy();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogoeasy();
                        break;
                }
            case 4:
                menuPrincipal();
                break;

            default:
                System.out.println("Opção invalida!!!\n");
                jogoeasy();
                break;
        }
        menuPrincipal();
    }

    public void jogohard() {
        
        int oponente;
        int voce;
        System.out.print("##--Digite uma opção--##\n\n");
        System.out.print("|-----------------------------|\n");
        System.out.print("| 1 - Pedra |\n");
        System.out.print("| 2 - Papel |\n");
        System.out.print("| 3 - Tesoura |\n");
        System.out.print("| 4 - Lagarto |\n");
        System.out.print("| 5 - Spock |\n");
        System.out.print("| 6 - Sair do jogo |\n");
        Scanner play = new Scanner(System.in);
        voce = play.nextInt();
        Random gerador = new Random();
        oponente = gerador.nextInt(5);
        switch (voce) {
            case 1:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n o Jogo empatou");
                        jogohard();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Papel cobre pedra\n Você perdeu");
                        jogohard();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Pedra amassa tesoura\n Você ganhou");
                        jogohard();
                        break;
                    case 3:
                        System.out.println("seu oponente jogou Lagarto\n Pedra esmaga lagarto\n  Você ganhou");
                        jogohard();
                        break;
                    case 4:
                        System.out.println("seu oponente jogou Spock\n Spock vaporiza pedra\n Você perdeu");
                        jogohard();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogohard();
                        break;
                }
                break;

            case 2:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Papel cobre pedra\n Você ganhou");
                        jogohard();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n o Jogo empatou");
                        jogohard();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Tesoura corta papel\n Você perdeu");
                        jogohard();
                        break;
                    case 3:
                        System.out.println("seu oponente jogou Lagarto\n Lagarto come papel \n  Você perdeu");
                        jogohard();
                        break;
                    case 4:
                        System.out.println("seu oponente jogou Spock\n Papel refuta Spock \n Você ganhou");
                        jogohard();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogohard();
                        break;
                }

            case 3:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Pedra amassa tesoura\n Você perdeu");
                        jogohard();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Tesoura corta papel \n Você ganhou");
                        jogohard();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura, o Jogo empatou");
                        jogohard();
                        break;
                    case 3:
                        System.out.println("seu oponente jogou Lagarto\n Tesoura decapita lagarto \n  Você ganhou");
                        jogohard();
                        break;
                    case 4:
                        System.out.println("seu oponente jogou Spock\n Spock esmaga (ou derrete) tesoura \n Você perdeu");
                        jogohard();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogohard();
                        break;
                }
            case 4:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Pedra esmaga lagarto \n Você perdeu");
                        jogohard();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Lagarto come papel \n Você ganhou");
                        jogohard();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Tesoura decapita lagarto \n Você perdeu");
                        jogohard();
                        break;
                    case 3:
                        System.out.println("seu oponente jogou Lagarto, o Jogo empatou");
                        jogohard();
                        break;
                    case 4:
                        System.out.println("seu oponente jogou Spock\n Lagarto envenena Spock\n Você ganhou");
                        jogohard();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogohard();
                        break;
                }

            case 5:
                switch (oponente) {
                    case 0:
                        System.out.println("seu oponente jogou Pedra\n Spock vaporiza pedra \n Você ganhou");
                        jogohard();
                        break;
                    case 1:
                        System.out.println("seu oponente jogou Papel\n Papel refuta Spock \n Você perdeu");
                        jogohard();
                        break;
                    case 2:
                        System.out.println("seu oponente jogou Tesoura\n Spock esmaga (ou derrete) tesoura \n Você ganhou");
                        jogohard();
                        break;
                    case 3:
                        System.out.println("seu oponente jogou Lagarto\n Lagarto envenena Spock \n Você perdeu");
                        jogohard();
                        break;
                    case 4:
                        System.out.println("seu oponente jogou Spock, o Jogo empatou");
                        jogohard();
                        break;
                    default:
                        System.out.println("Opção invalida!!!\n");
                        jogohard();
                        break;
                }
            case 6:
                menuPrincipal();
                break;

            default:
                System.out.println("Opção invalida!!!\n");
                jogohard();
                break;
        }
        menuPrincipal();
    }
}
