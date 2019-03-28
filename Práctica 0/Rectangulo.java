public class Rectangulo
{
	//atributos
	private float ladoA;
	private float ladoB;
	private float altura;

	//constructores
	public Rectangulo( float ladoA)
	{
		this.ladoA = ladoA;
		ladoB = ladoA;
		altura = 0;
	}

	public Rectangulo( float ladoA, float ladoB )
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		altura = 0;
	}

	public Rectangulo( float ladoA, float ladoB, float altura)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.altura = altura;
	}

	//métodos
	public float getArea()
	{
		return ladoA * ladoB;
	}

	public float getVolumen()
	{
		return ladoA * ladoB * altura;
	}
}
