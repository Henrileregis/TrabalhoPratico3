package trabpratico3.git;

public class Quadrados implements InterfaceGeometrica {
	
	public double lado;

    public Quadrados(double lado) {
        this.lado = lado;
    }
      
    @Override
    public double calculoPerimetro() {
        return 4 * (lado); //formula do calculo do perimetro de um quadrado.
    }
    
    @Override
    public double calculoArea() {
        return (lado * lado); //formula do calculo da area de um quadrado.
    }
      
}
