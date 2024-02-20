import java.util.Scanner;
    public class Menu {
//Luquian César
        public static void main(String[] args) {
            Float Av, Par, Div, preB1;
            //Q.5
            Float peca1, preca1, peca2, preca2, soma, re1, re2;
            //Q.2
            Float peso1, tot;
            Integer p1 = 23;
            //Q.4
            Double a, b, c;
            Double area, area1, area2, area3;
            Double PI = 3.14;
            //Q.1
            Double a1, b1, c1, d1, Diferença;
            //Q.3
            Scanner menu = new Scanner (System.in);
            while (true) {
                System.out.print("##-- Menu de Questões --##\n\n");
                System.out.print("|--------|\n");
                System.out.print("| Q. 1 --|\n");
                System.out.print("| Q. 2 --|\n");
                System.out.print("| Q. 3 --|\n");
                System.out.print("| Q. 4 --|\n");
                System.out.print("| Q. 5 --|\n");
                System.out.print("|--------|\n");
                System.out.print("--Digite o número da questão: ");
                int Q = menu.nextInt();
                if (Q == 5) {
                    System.out.println("Digite o preço do Produto escolhido: ");
                    Scanner scan = new Scanner(System.in);
                    preB1 = scan.nextFloat();
                    Av = (preB1 - (preB1 * 1 / 10));
                    Par = (preB1 / 3);
                    Div = (preB1 + (preB1 * 1 / 20));
                    System.out.println(" Temos as seguintes formas de pagamento: ");
                    System.out.println(" À Vista com 10% de Desconto; ");
                    System.out.println(Av);
                    System.out.println(" Parcelado em 3 vezes sem desconto; ");
                    System.out.println(Par);
                    System.out.println(" Dividido em 10 vezes com juros de 5%. ");
                    System.out.println(Div);
                    scan.close();
                    menu.close();
                    break;
                }
                if (Q == 2) {
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println("Escreva o código da peça 1: ");
                    re1 = scan1.nextFloat();
                    System.out.println("Escreva o código da peça 2: ");
                    re2 = scan1.nextFloat();
                    System.out.println("Escreva o número de peças 1: ");
                    peca1 = scan1.nextFloat();
                    System.out.println("Escreva o preço da Peça 1: ");
                    preca1 = scan1.nextFloat();
                    System.out.println("Escreva o número de peças 2: ");
                    peca2 = scan1.nextFloat();
                    System.out.println("Escreva o preço da peça 2: ");
                    preca2 = scan1.nextFloat();
                    soma = (peca1*preca1 + peca2*preca2);
                    System.out.println("O valor total das peças 1 e 2 é: " + soma);
                    System.out.println("código da peça 1: " +re1);
                    System.out.println("código da peça 2: " +re2);
                    scan1.close();
                    menu.close();
                    break;
                }
                if (Q == 4) {
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println(" Escreva o peso do seu prato do almoço: ");
                    peso1 = scan2.nextFloat();
                    tot = (p1*peso1);
                    System.out.println("O preço total do almoço é: " + tot);
                    scan2.close();
                    menu.close();
                    break;
                }
                if (Q == 1) {
                    Scanner scan3 = new Scanner(System.in);
                    //Área do Circulo
                    System.out.println("Escreva o valor do raio do circulo: ");
                    c = scan3.nextDouble();
                    area = scan3.nextDouble();
                    area  = PI* (c*c);
                    System.out.print("O valor da area é " + area);
                    System.out.println(area);
                    //Area do Quadrado
                    System.out.println("Escreva o valor do lado do quadrado: ");
                    a = scan3.nextDouble();
                    area1 = (a*a);
                    System.out.print(" O valor da area é: " + area1);
                    System.out.println(area1);
                    //Area do Triângulo
                    System.out.println("Escreva o valor da base do triangulo: ");
                    a = scan3.nextDouble();
                    System.out.println("Escreva o valor da altura do triangulo: ");
                    c = scan3.nextDouble();
                    area2 = (a*c) /2;
                    System.out.println("O valor da area é: "+ area2);
                    // Area do Trapezio
                    System.out.println("Escreva o valor da base menor do trapézio: ");
                    a = scan3.nextDouble();
                    System.out.println("Escreva o valor da base maior do trapézio: ");
                    b = scan3.nextDouble();
                    System.out.println("Escreva a altura do trapézio: ");
                    c = scan3.nextDouble();
                    area3 = (a+b)*c /2;
                    System.out.println("O valor da area é: "+ area3);
                    scan3.close();
                    menu.close();
                  break;
                }
                if (Q == 3) {
                    Scanner scan4 = new Scanner(System.in);
                    System.out.println("Digite o valor de A: ");
                    a1 = scan4.nextDouble();
                    System.out.println("Digite o valor de B: ");
                    b1 = scan4.nextDouble();
                    System.out.println("Digite o valor de C: ");
                    c1 = scan4.nextDouble();
                    System.out.println("Digite o valor de D: ");
                    d1 = scan4.nextDouble();
                    Diferença = (a1*b1 - c1*d1);
                    System.out.println("O valor da Diferença é:" + Diferença);
                    scan4.close();
                    menu.close();
                    break;
                }
            }
        }
    }