import java.util.*;
public class Asimex {
	public static void main(String[] args) {
		ArrayList<Invoice> facturas = new ArrayList();
        Scanner entrada = new Scanner(System.in);
        int cantidadFacturas;
        System.out.println("¿Cuántas facturas desea?");
        cantidadFacturas = entrada.nextInt();
        for (int i = 0; i < cantidadFacturas ; i++ ) {
        	System.out.println("____________DATOS FAC "+(i+1)+"_________");
        	Invoice factura = new Invoice();
            System.out.println("Ingrese el numero de referencia");
            entrada.nextLine();
            factura.changeReferenceNumber(entrada.nextLine());
            System.out.println("Ingrese la fecha");
            factura.changeFecha(entrada.nextLine());
            System.out.println("Ingrese la cantidad de piezas");                
            factura.changePiezas(entrada.nextShort());
            System.out.println("Ingrese el tipo de flete");
            entrada.nextLine();
            factura.changeFlete(entrada.nextLine());
            System.out.println("Ingrese el destinatario");
            factura.changeDestinatario(entrada.nextLine());
            System.out.println("Ingrese el nombre del proyecto");
            factura.changeProjectName(entrada.next());
            System.out.println("Ingrese su estado de la republica");
            factura.changeEstadoRepublica(entrada.next());
            factura.calcular();
            facturas.add(factura);
            System.out.println("_______________________________");
        }

        for (Invoice factura : facturas) {
        	factura.imprimir();
        }

	}  
}