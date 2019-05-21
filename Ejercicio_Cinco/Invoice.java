public class Invoice {
	public String numReferencia;
	public int numRequisicion = 0;
	public static int counter = 0;
	public static String direccion = "Mario Pani 177, Santa Fe, cdmx";
	public String fecha;
	public short cantidadDePiezas;
	public short numDeCajas;
	public String tipoFlete;
	public String destinatario;
	public String projectName;
	public String estadoRepublica;
	public float total;

	public Invoice() {
        numRequisicion = counter;
        counter++;
    }

    public void changeFecha(String address) {
        fecha = address;
    }

    public void changeReferenceNumber(String refNumber) {
        numReferencia = refNumber;
    }    

    public void changeFlete(String tipoFlete) {
        this.tipoFlete = tipoFlete;
    } 

    public void changePiezas(short piezas) {
      cantidadDePiezas = piezas;
    }

    public void changeNumRequ(short numReq) {
      numRequisicion = numReq;
    }

    public void changeDestinatario(String destinatario) {
      this.destinatario = destinatario;
    }

    public void changeProjectName(String projectName) {
      this.projectName = projectName;
    }

    public void changeEstadoRepublica(String estadoRepublica) {
      this.estadoRepublica = estadoRepublica;
    }

    public void calcular() {
        int cajas = (cantidadDePiezas/20);

        if((cantidadDePiezas%20) == 0) {
            numDeCajas = ((short)cajas);
            if(tipoFlete.equals("Foraneo")) {
                total = ((numDeCajas*35));
                System.out.println("Total: "+total);
            }
            else if(tipoFlete.equals("Local")) {
                if((numDeCajas%3) == 0) {
                    total = ((numDeCajas/3)*25);
                    System.out.println("Total: "+total);
                }
                else {
                    total = (((numDeCajas/3)+1)*25);
                    System.out.println("Total: "+total);
                }
            }
        }
        else {
            numDeCajas = ((short)(cajas+1));
            if(tipoFlete.equals("Foraneo")) {
                total = ((numDeCajas*35));
                System.out.println("Total: "+total);
            }
            else if(tipoFlete.equals("Local")) {
                if((numDeCajas%3) == 0) {
                    total = ((numDeCajas/3)*25);
                    System.out.println("Total: "+total);
                }
                else {
                    total = (((numDeCajas/3)+1)*25);
                    System.out.println("Total: "+total);
                }
            }
        }        

    }

    public void imprimir() {        
        System.out.println("************************");
        System.out.println("****    FACTURA    *****");
        System.out.println("************************");
        System.out.println("No. Referencia: " + numReferencia );
        System.out.println("No. Requisicion: "+ numRequisicion );
        System.out.println("Direccion: "+ direccion);
        System.out.println("Fecha: " + fecha);
        System.out.println("Cantidad de piezas: " + cantidadDePiezas);
        System.out.println("No. Cajas: " + numDeCajas);
        System.out.println("Tipo de flete: " + tipoFlete);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Project Name: " + projectName);
        System.out.println("Estado: " + estadoRepublica);
        System.out.println("Total: " + total);
    }
}
