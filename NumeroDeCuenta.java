//Juan del Pozo Ávila
package fp2.poo.pfpoojuadelavi;
import  fp2.poo.utilidades.NumeroDeCuentaInterfaz;
import  fp2.poo.pfpoojuadelavi.Excepciones.NumeroDeCuentaIncorrectaExcepcion;
import java.lang.Exception;

public class NumeroDeCuenta implements NumeroDeCuentaInterfaz {

    public String cuenta;

   
    public String getNumeroDeCuenta(){
	return this.cuenta;
    }

  
    public void  setNumeroDeCuenta( String numeroDeCuenta ) throws NumeroDeCuentaIncorrectaExcepcion{

	this.cuenta = numeroDeCuenta;
	if(cuenta.length() != 20)
	    throw new NumeroDeCuentaIncorrectaExcepcion("e");
    }
    public  NumeroDeCuenta( String numeroDeCuenta ) throws NumeroDeCuentaIncorrectaExcepcion{

	this.cuenta = numeroDeCuenta;
	if(cuenta.length() != 20)
	    throw new NumeroDeCuentaIncorrectaExcepcion("e");
    }
			
}

