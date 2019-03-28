public class Circulo
{
	//atributos
	private double radio;
	private double diametro;

	//constructor
	public Circulo( double diametro )
	{
		this.diametro = diametro;
		radio = diametro / 2;
	}

	public Circulo( double radio, double diametro )
	{
		this.radio = radio;
		this.diametro = diametro;
	}

	//métodos
	public double getArea()
	{
		return 3.1416 * radio * radio;
	}

	public double getVolumen()
	{
		return ( 4 / 3 ) * 3.1416 * radio * radio * radio; 
	}
}
