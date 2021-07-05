package trabpratico3.git;

public abstract class AbstrataQuadrilateros {
	
	public double lado1;
	public double lado2;
	public double lado3;
	public double lado4;

	public AbstrataQuadrilateros (double lado1, double lado2, double lado3, double lado4) {
		
		  this.lado1 = lado1;
	      this.lado2 = lado2;
	      this.lado3 = lado3;
	      this.lado4 = lado4;
	}

	public double calculoPerimetro(double lado1, double lado2, double lado3, double lado4) {
		
		  return (lado1 + lado2 + lado3 + lado4); //Calculo do perimetro de um quadrilatero = soma dos quatro lados.
	}

}
