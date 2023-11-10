import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    	//DEFINE A URL DO SERVIDOR
        String urlServ = "http://localhost:8185"; 
        ClienteRPC rpc = new ClienteRPC(urlServ);

        //Permite inserir os valores que o usuário deseja
        Scanner entrada = new Scanner(System.in);
        int menu;

        //usando o do/while para garantir que o programa só se encerre ao digitar 0 no menu inicial
        do {
            System.out.println("\n------------------------------------------");
            System.out.println("|Escolha quantas dimensões a figura tem: |");
            System.out.println("|========================================|");
            System.out.println("|               (1) - 2D                 |");
            System.out.println("|               (2) - 3D                 |");
            System.out.println("|               (0) - Sair               |");
            System.out.println("------------------------------------------");
            System.out.println("Opção: ");
            
            //solicita a inserção de um valor inteiro ao usuário
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n------------------------------------------");
                    System.out.println("|                Figuras 2D              |");
                    System.out.println("|========================================|");
                    System.out.println("|         (1) - Quadrado                 |");
                    System.out.println("|         (2) - Triângulo Retângulo      |");
                    System.out.println("|         (3) - Círculo                  |");
                    System.out.println("|         (0) - Voltar                   |");
                    System.out.println("------------------------------------------");
                    System.out.println("Opção: ");

                    int doisD = entrada.nextInt();
                    
                    switch (doisD) {
                        case 1:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|             Área do quadrado           |");
                            System.out.println("------------------------------------------");
                            System.out.println("\nLado do quadrado: ");
                            int lado = entrada.nextInt();
                            //passa o valor digitado para o ClienteRPC e ele manda para o servidor executar o calculo, mostrando o resultado
                            System.out.println("\nÁrea total do quadrado é: " + rpc.AreaQuadrado(lado)); 
                        break;

                        case 2:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|            Área do triângulo           |");
                            System.out.println("------------------------------------------");
                            System.out.println("\nBase do triângulo:");
                            int base = entrada.nextInt();
                            System.out.println("\nAltura do triângulo:");
                            int altura = entrada.nextInt();
                            System.out.println("\nÁrea total do triângulo é: " + rpc.AreaTrianguloRetangulo(base,altura));
                        break;

                        case 3:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|            Área do círculo             |");
                            System.out.println("------------------------------------------");
                            System.out.println("\nRaio do círculo:");
                            int raio = entrada.nextInt();
                            System.out.println("\nÁrea total do círculo é: " + rpc.AreaCircunferencia(raio));
                        break;

                        case 0:
                            // Voltara para o menu inicial
                        break;
                        
                        default:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|           Opção inválida!!             |");
                            System.out.println("|========================================|");
                            System.out.println("|       Reiniciando menu principal       |");
                            System.out.println("------------------------------------------");
                        break;
                    }break;

                case 2:
                    System.out.println("\n------------------------------------------");
                    System.out.println("|               Figuras 3D               |");
                    System.out.println("|========================================|");
                    System.out.println("|               (1) - Cilindro           |");
                    System.out.println("|               (2) - Cubo               |");
                    System.out.println("|               (3) - Esfera             |");
                    System.out.println("|               (0) - Voltar             |");
                    System.out.println("------------------------------------------");
                    System.out.println("Opção: ");

                    int tresD = entrada.nextInt();

                    switch (tresD) {
                        case 1:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|           Calculos do cilindro         |");
                            System.out.println("|========================================|");
                            System.out.println("|               (1) - Área               |");
                            System.out.println("|               (2) - Volume             |");
                            System.out.println("|               (0) - Voltar             |");
                            System.out.println("------------------------------------------");
                            System.out.println("Opção: ");

                        int cilindro = entrada.nextInt();

                        switch (cilindro) {
                            case 1:
                                System.out.println("\nDigite o raio do cilindro:");
                                int raio = entrada.nextInt();
                                System.out.println("\nDigite a altura do cilindro:");
                                int altura = entrada.nextInt();
                                System.out.println("\nÁrea total do cilindro é: " + rpc.AreaCilindro(raio,altura));
                            break;

                            case 2:
                                System.out.println("\nDigite o raio do cilindro:");
                                raio = entrada.nextInt();
                                System.out.println("\nDigite a altura do cilindro:");
                                altura = entrada.nextInt();
                                System.out.println("\nVolume total do cilindro é: " + rpc.VolumeCilindro(raio,altura));
                            break;

                            case 0:
                                // Voltara para o menu inicial
                            break;
                        
                            default:
                                System.out.println("\n------------------------------------------");
                                System.out.println("|           Opção inválida!!             |");
                                System.out.println("|========================================|");
                                System.out.println("|       Reiniciando menu principal       |");
                                System.out.println("------------------------------------------");
                            break;
                        }break;
                        

                        case 2:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|            Calculos do cubo            |");
                            System.out.println("|========================================|");
                            System.out.println("|               (1) - Área               |");
                            System.out.println("|               (2) - Volume             |");
                            System.out.println("|               (0) - Voltar             |");
                            System.out.println("------------------------------------------");
                            System.out.println("Opção: ");

                            int cubo = entrada.nextInt();

                            switch (cubo) {
                                case 1:
                                    System.out.println("\nDigite o lado do cubo:");
                                    int lado = entrada.nextInt();
                                    System.out.println("\nÁrea total do cubo é: " + rpc.AreaCubo(lado));
                                break;

                                case 2:
                                    System.out.println("\nDigite o lado do cubo:");
                                    lado = entrada.nextInt();
                                    System.out.println("\nVolume total do cubo é: " + rpc.VolumeCubo(lado));
                                break;

                                case 0:
                                    // Voltara para o menu inicial
                                break;
                            
                                default:
                                    System.out.println("\n------------------------------------------");
                                    System.out.println("|           Opção inválida!!             |");
                                    System.out.println("|========================================|");
                                    System.out.println("|       Reiniciando menu principal       |");
                                    System.out.println("------------------------------------------");
                                break;
                            }break;
                        

                        case 3:
                            System.out.println("\n------------------------------------------");
                            System.out.println("|            Calculos do esfera          |");
                            System.out.println("|========================================|");
                            System.out.println("|               (1) - Área               |");
                            System.out.println("|               (2) - Volume             |");
                            System.out.println("|               (0) - Voltar             |");
                            System.out.println("------------------------------------------");
                            System.out.println("Opção: ");

                            int esfera = entrada.nextInt();

                            switch (esfera) {
                                case 1:
                                    System.out.println("\nDigite o raio da esfera:");
                                    int raio = entrada.nextInt();
                                    System.out.println("\nÁrea total da esfera é: " + rpc.AreaEsfera(raio));
                                break;

                                case 2:
                                    System.out.println("\nDigite o raio da esfera:");
                                    raio = entrada.nextInt();
                                    System.out.println("\nVolume total da esfera é: " + rpc.VolumeEsfera(raio));
                                break;

                                case 0:
                                    // Voltara para o menu inicial
                                break;
                            
                                default:
                                    System.out.println("\n------------------------------------------");
                                    System.out.println("|           Opção inválida!!             |");
                                    System.out.println("|========================================|");
                                    System.out.println("|       Reiniciando menu principal       |");
                                    System.out.println("------------------------------------------");
                                break;
                            }
                        break;

                    }break;
                case 0:
                    //sai do menu e encerra o programa
                    System.out.println("\n------------------------------------------");
                    System.out.println("|               Desligando...            |");
                    System.out.println("------------------------------------------");
                break;

                default:
                    System.out.println("\n------------------------------------------");
                    System.out.println("|           Opção inválida!!             |");
                    System.out.println("|========================================|");
                    System.out.println("|       Reiniciando menu principal       |");
                    System.out.println("------------------------------------------");
                break;
                
            }
        } while (menu != 0);
        System.out.println("\n------------------------------------------");
        System.out.println("|           Aplicação finalizada         |");
        System.out.println("------------------------------------------");
    }
}
