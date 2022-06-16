//Juan del Pozo Ávila

package fp2.poo.pfpoojuadelavi;
import  fp2.poo.utilidades.DniInterfaz;
import  fp2.poo.pfpoojuadelavi.Excepciones.DniIncorrectoExcepcion;
import java.lang.Exception;

public class Dni implements DniInterfaz {

    public String Dni;
    /**
     * Descripcion: metodo que proporciona un valor 
     *              para configurar  el dni.
     */ 
    public void setDni( String dni ) throws DniIncorrectoExcepcion{

	this.Dni = dni;
	if(Dni.length() != 9)
	    throw new DniIncorrectoExcepcion("e");
    }
	

    /**
     * Descripcion: metodo que devuelve como String el dni.
     */
    public String getDni(){

	return this.Dni;
    }
    public  Dni( String dni ) throws DniIncorrectoExcepcion{

	this.Dni = dni;
	if(Dni.length() != 9)
	    throw new DniIncorrectoExcepcion("e");
	
    }   
}
