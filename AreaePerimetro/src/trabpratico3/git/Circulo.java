package trabpratico3.git;

public class Circulo implements InterfaceGeometrica {
	
	public double raio;

    public Circulo() {
        this.raio = 1;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calculoPerimetro() {
        return (2 * (Math.PI)) * (raio); //formula do calculo do perimetro de um circulo.
    }
    
    @Override
    public double calculoArea() {
        return (raio * raio) * (Math.PI); //formula do calculo da area de um circulo.
    }

 

}
