package a1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu1 {
    private List<Forma> formas = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int opcao = -1;

    public void iniciar() {
        while (opcao != 0) {
            System.out.println("\nMENU DAS FORMAS");
            System.out.println("1 - Cadastrar uma forma");
            System.out.println("2 - Mostrar descricoes");
            System.out.println("3 - Mostrar areas");
            System.out.println("4 - Mostrar volumes");
            System.out.println("5 - Verificar intersecoes (Circulos e Esferas)");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                cadastrarForma();
            } else if (opcao == 2) {
                for (Forma f : formas) {
                    System.out.println(f.exibirDescricao());
                    System.out.println("-----------------");
                }
            } else if (opcao == 3) { 
                for (Forma f : formas) {
                    if (f instanceof FormaBidimensional) {
                        FormaBidimensional formaBi = (FormaBidimensional) f;
                        System.out.println(formaBi.exibirArea());
                    }
                }
            } else if (opcao == 4) {
                for (Forma f : formas) {
                    if (f instanceof FormaTridimensional) {
                        FormaTridimensional formatri = (FormaTridimensional) f;
                        System.out.println(formatri.exibirVolume());
                    }
                }
            } else if (opcao == 5) {
                verificarIntersecoes();
            }
        }
    }

    public void cadastrarForma() {
        System.out.println("Deseja cadastrar uma forma: (1) Bidimensional ou (2) Tridimensional?");
        int tipoDimensao = scanner.nextInt();
        scanner.nextLine();

        if (tipoDimensao == 1) {
            System.out.println("Qual forma deseja cadastrar:\n1 - Circulo\n2 - Quadrado\n3 - Triangulo\n4 - Voltar");
            int formaOpcao = scanner.nextInt();
            scanner.nextLine();

            if (formaOpcao != 4) {
                System.out.print("Digite a cor: ");
                String cor = scanner.nextLine();
                System.out.print("Digite o X: ");
                double x = scanner.nextDouble();
                System.out.print("Digite o Y: ");
                double y = scanner.nextDouble();
                scanner.nextLine();

                if (formaOpcao == 1) {
                    System.out.print("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Circulo(cor, x, y, raio));
                } else if (formaOpcao == 2) {
                    System.out.print("Digite o lado: ");
                    double lado = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Quadrado(cor, x, y, lado));                
                } else if (formaOpcao == 3) {
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Triangulo(cor, x, y, base, altura));                     
                }
            }
        } else if (tipoDimensao == 2) {
            System.out.println("Qual forma deseja cadastrar:\n1 - Esfera\n2 - Cubo\n3 - Tetraedro\n4 - Voltar");
            int formaOpcao = scanner.nextInt();
            scanner.nextLine();

            if (formaOpcao != 4) {
                System.out.print("Digite a cor: ");
                String cor = scanner.nextLine();
                System.out.print("Digite o X: ");
                double x = scanner.nextDouble();
                System.out.print("Digite o Y: ");
                double y = scanner.nextDouble();
                System.out.print("Digite o Z: ");
                double z = scanner.nextDouble();
                scanner.nextLine();

                if (formaOpcao == 1) {
                    System.out.print("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Esfera(cor, x, y, z, raio));
                } else if (formaOpcao == 2) {
                    System.out.print("Digite o lado: ");
                    double lado = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Cubo(cor, x, y, z, lado));                
                } else if (formaOpcao == 3) {
                    System.out.print("Digite a base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Digite a altura da base: ");
                    double baseAltura = scanner.nextDouble();
                    System.out.print("Digite a altura do tetraedro: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();
                    formas.add(new Tetraedro(cor, x, y, z, base, baseAltura, altura));                     
                }
            }            
        }
    }

    private void verificarIntersecoes() {
        List<Circulo> circulos = new ArrayList<>();
        List<Esfera> esferas = new ArrayList<>();

        for (Forma f : formas) {
            if (f instanceof Circulo) circulos.add((Circulo) f);
            else if (f instanceof Esfera) esferas.add((Esfera) f);
        }

        System.out.println("\n--- VERIFICAÇÃO DE INTERSEÇÃO: CÍRCULOS ---");
        if (circulos.size() < 2) {
            System.out.println("É necessário cadastrar pelo menos 2 círculos para comparar.");
        } else {
            for (int i = 0; i < circulos.size(); i++) {
                for (int j = i + 1; j < circulos.size(); j++) {
                    boolean intercepta = circulos.get(i).intercepta(circulos.get(j));
                    System.out.println("Círculo " + (i + 1) + " e Círculo " + (j + 1) + 
                                       ": " + (intercepta ? "SE INTERCEPTAM" : "NÃO se interceptam"));
                }
            }
        }

        System.out.println("\n--- VERIFICAÇÃO DE INTERSEÇÃO: ESFERAS ---");
        if (esferas.size() < 2) {
            System.out.println("É necessário cadastrar pelo menos 2 esferas para comparar.");
        } else {
            for (int i = 0; i < esferas.size(); i++) {
                for (int j = i + 1; j < esferas.size(); j++) {
                    boolean intercepta = esferas.get(i).intercepta(esferas.get(j));
                    System.out.println("Esfera " + (i + 1) + " e Esfera " + (j + 1) + 
                                       ": " + (intercepta ? "SE INTERCEPTAM" : "NÃO se interceptam"));
                }
            }
        }
    }
}
