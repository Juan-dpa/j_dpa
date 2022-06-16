//Juan del Pozo Ávila
package fp2.poo.pfpoojuadelavi;
import fp2.poo.utilidades.SaldoInterfaz;

public class Saldo implements SaldoInterfaz{

    private double saldo;
    private Double saldo1 = null;
   
    public double getSaldo(){

	return this.saldo;
    }

   
    public Double getSaldoDouble(){

	return this.saldo1;
	}

    
    public void setSaldo(Double d){

	this.saldo1 = new Double(d);
    }

   
    public void setSaldo(double d){

	this.saldo = d;
    }
    public Saldo(double d){

	this.saldo = d;
    }
    
}
