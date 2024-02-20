import java.util.Scanner;
public class Menu2 {
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
  Scanner entrada = new Scanner(System.in);
  System.out.println("Escolha uma questão entre 1 e 5");
  int numero = entrada.nextInt();
   switch (numero) {
     case 1:
       System.out.println("A questão escolhida foi: 1.");
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
                  break;
     case 2:
       System.out.println("A questão escolhida foi: 2.");
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
                    break;
     case 3:
       System.out.println("A questão escolhida foi: 3.");
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
                    break;
     case 4:
       System.out.println("A questão escolhida foi: 4.");
       Scanner scan2 = new Scanner(System.in);
                    System.out.println(" Escreva o peso do seu prato do almoço: ");
                    peso1 = scan2.nextFloat();
                    tot = (p1*peso1);
                    System.out.println("O preço total do almoço é: " + tot);
                    scan2.close();
                    break;
     case 5:
       System.out.println("A questão escolhida foi: 5.");
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
                    break;
     default:
       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 5.");
       entrada.close();
       break;
   }}}