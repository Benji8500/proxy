package proxy;

public class ProxyDebitCard implements  IAccount{
   
	private BankAccount cuentaReal;

    private int number;
    private int securityCode;
    // dato importante // no debe tener su metodo set/get del objeto realSubject

    public ProxyDebitCard(int number, int securityCode, String nombre, int Saldo){
        cuentaReal= new BankAccount(nombre, Saldo);
        this.number=number;
        this.securityCode=securityCode;
    }
    
    

    

    public BankAccount getCuentaReal() {
		return cuentaReal;
	}





	public void setCuentaReal(BankAccount cuentaReal) {
		this.cuentaReal = cuentaReal;
	}





	public int getNumber() {
		return number;
	}





	public void setNumber(int number) {
		this.number = number;
	}





	public int getSecurityCode() {
		return securityCode;
	}





	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}





	@Override
    public void retirar(int monto, String moneda ) {
        // filtro para utilizar el objeto real
        if (moneda == "$"){
            System.out.println("Transaccion de "+ monto+ " dolares");
            this.cuentaReal.retirar((monto*7), "Bs");
        } else if (moneda == "E"){
            System.out.println("Transaccion de "+ monto+ " euros");
            this.cuentaReal.retirar((monto*9), "Bs");
        } else if (moneda == "Bs"){
            System.out.println("Transaccion de "+ monto+ " bolivianos");
            this.cuentaReal.retirar(monto, "Bs");
        } else {
        	System.out.println("No se puede hacer una transaccion con la moneda seleccionada");
        }
    }
}