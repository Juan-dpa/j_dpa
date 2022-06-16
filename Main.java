//Juan del Pozo Ávila
package fp2.poo.pfpoojuadelavi;
import fp2.poo.pfpoojuadelavi.Excepciones.DniIncorrectoExcepcion;
import fp2.poo.pfpoojuadelavi.Excepciones.NumeroDeCuentaIncorrectaExcepcion;
import fp2.poo.pfpoojuadelavi.Dni;
import fp2.poo.pfpoojuadelavi.NumeroDeCuenta;
import fp2.poo.pfpoojuadelavi.Saldo;
import java.lang.Exception;

class Main{
    public static void main (String args[]){
	Saldo saldocr7 = new Saldo(8.8d);

	//GENERAMOS LAS CLASES CON POSIBLES EXCEPCIONES

	try{
	    Dni dnicr7 = new Dni("DniErroneo");
	}catch (DniIncorrectoExcepcion e){
	    System.out.println("Se lanzó la excepción: "+ e);
	}
		
	try{
	    NumeroDeCuenta cuentacr7 = new NumeroDeCuenta("NumeroErroneo");
	}catch (NumeroDeCuentaIncorrectaExcepcion e){
	    System.out.println("Se lanzó la excepción: "+ e);
	}
	    
		
    }

}


    
