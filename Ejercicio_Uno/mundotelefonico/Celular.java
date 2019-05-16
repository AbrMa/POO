public class Celular
{
	private double saldo;
	private String marca;
	private String modelo;

	public Celular()
	{
		saldo = 100f;
		marca = "Sony";
		modelo = "Xperia XZ1";
	}

	public void setSaldo(double saldo)
	{
		this.saldo = saldo;
	}

	public void setMarca(String marca)
	{
		this.marca = marca;
	}

	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}

	public double getSaldo()
	{
		return saldo;
	}

	public String getMarca()
	{
		return marca;
	}

	public String getModelo()
	{
		return modelo;
	}
	
	public void abonar(int cantidad)
	{
		float abono = (float)cantidad;
		if(abono == 100)
			abono += 20f;
		if(abono == 200)
			abono += 100f;
		if(abono == 500)
			abono += 500f;
		if((saldo + abono) <= 3000)
		{
			saldo += abono;
			System.out.println("Recarga exitosa compa, su nuevo sueldo es de: " + saldo);	
		}
		else
		{
			System.out.println("Su saldo actual es de: " +  saldo + ", no puede tener mas de 3000, sorry compa");
		}
	}

	public void enviarMensaje(String mensaje)
	{
		if(saldo >= 1.15)
		{
			System.out.println("*******************");
			System.out.println("**MENSAJE ENVIADO**");
			System.out.println("*******************");
			System.out.println("\n" + mensaje);
			saldo -= 1.15;
		}
		else
		{
			System.out.println("No tiene el saldo suficiente compa.");
		}
	}

	public void llamar(int tiempo)
	{
		float costo = (float)tiempo * 4.8f;	
		if(saldo - costo >= 0)
		{
			System.out.println("Su llamada duró " + tiempo + " min");
			System.out.println("El costo de su llamada es " + costo);
			System.out.println("Su nuevo saldo es de " + (saldo - costo));
		}
		else
		{
			System.out.println("No tienes saldo pobretón, recargue su cel compa");
		}
	}

	public void mostrar()
	{
		System.out.println("Su saldo es de: " + saldo);
		System.out.println("Su marca es: " + marca);
		System.out.println("Su modelo es: " + modelo);
	}
}
