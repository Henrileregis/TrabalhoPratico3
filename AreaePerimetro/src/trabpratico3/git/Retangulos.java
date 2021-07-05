package trabpratico3.git;

public class Retangulos implements InterfaceGeometrica{ 
	
	public double base;
    public double altura;

    public Retangulos(double base, double altura) {
    this.base = base;
    this.altura = altura;
    }

    @Override
    public double calculoPerimetro() {
    return 2 * (base + altura); //formula do calculo do perimetro de um retangulo. 
    }
    
    @Override
    public double calculoArea() {
    return (base * altura); //formula do calculo da area de um retangulo. 
    }

    
}
