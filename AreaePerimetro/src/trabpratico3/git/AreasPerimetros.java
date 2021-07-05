package trabpratico3.git;

//Trabalho prático 3 - Áreas e Perímetros de algumas formas geométricas.
//Autor: Henrileregis Bezerra Soares Pessoa

import java.util.Scanner;

public class AreasPerimetros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Por favor digite o lado do quadrado: ");
        double ladoQuadrado = sc.nextDouble();
        
        System.out.println("Por favor digite o raio do circulo: ");
        double raioCirculo = sc.nextDouble();
                
        System.out.println("Por favor digite a base e a altura do retangulo: ");
        double baseRetangulo = sc.nextDouble();
        double alturaRetangulo = sc.nextDouble();
                
        System.out.println("O lado do quadrado é: " + ladoQuadrado);
        System.out.println("O raio do circulo é: " + raioCirculo);
        System.out.println("A a base e a altura do retangulo são: " + baseRetangulo + " e " + alturaRetangulo);
     
        Quadrados quadrado1 = new Quadrados(ladoQuadrado);
        Circulo circulo1 = new Circulo(raioCirculo);
        Retangulos retangulo1 = new Retangulos(baseRetangulo, alturaRetangulo);

        System.out.println("Os perimetros do quadrado, circulo e retangulo são: " + quadrado1.calculoPerimetro() + " , " + circulo1.calculoPerimetro() + " e " + retangulo1.calculoPerimetro());
        System.out.println("As áreas do quadrado, circulo e retangulo são: " + quadrado1.calculoArea() + " , " + circulo1.calculoArea() + " e " + retangulo1.calculoArea());        
                 
    }

}