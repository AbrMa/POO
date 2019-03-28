public class Practica0
{
	public static void main( String[] args )
	{
		Scanner entrada = new Scanner( System.in );
		Rectangulo uno = new Rectangulo( 4f );
		Rectangulo dos = new Rectangulo( 5f, 2f);
		Rectangulo tres = new Rectangulo( 5f, 2f, 4f);
		Circulo a = new Circulo( 4 ); 
		Circulo b = new Circulo( 5, 2.5 ); 

		System.out.println( "El área del primer circulo " + a.getArea() );
		System.out.println( "El área del segundo circulo " + b.getArea() );
		System.out.println( " " );
		System.out.println( "El volumen del primer circulo " + a.getVolumen() );
		System.out.println( "El volumen del segundo circulo " + b.getVolumen() );

		System.out.println( " " );

		System.out.println( "El área del primer rectangulo es : " + uno.getArea() ); 
		System.out.println( "El área del segundo rectangulo es : " + dos.getArea() ); 
		System.out.println( "El área del tercero rectangulo es : " + tres.getArea() ); 

		System.out.println( " " );
		
		System.out.println( "El volumen del primer rectangulo es : " + uno.getVolumen() ); 
		System.out.println( "El volumen del segundo rectangulo es : " + dos.getVolumen() ); 
		System.out.println( "El volumen del tercero rectangulo es : " + tres.getVolumen() ); 
	}
}
